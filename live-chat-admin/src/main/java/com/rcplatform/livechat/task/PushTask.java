package com.rcplatform.livechat.task;

import com.google.android.gcm.server.MulticastResult;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.rcplatform.livechat.common.enums.*;
import com.rcplatform.livechat.common.push.GoogleGcmPush;
import com.rcplatform.livechat.common.push.IosPush;
import com.rcplatform.livechat.config.PushMessage;
import com.rcplatform.livechat.common.push.PushResult;
import com.rcplatform.livechat.dto.response.PushUserDto;
import com.rcplatform.livechat.mapper.*;
import com.rcplatform.livechat.model.Push;
import com.rcplatform.livechat.model.PushCountry;
import com.rcplatform.livechat.model.PushLanguage;
import com.rcplatform.livechat.model.User;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by yang peng on 2016/11/8.
 */
@Service
public class PushTask {


    private Logger logger = LoggerFactory.getLogger(PushTask.class);


    @Resource
    private PushMapper pushMapper;

    @Resource
    private PushInfoMapper pushInfoMapper;

    @Resource
    private PushUserMapper pushUserMapper;


    @Autowired
    private IosPush iosPush;


    @Autowired
    private PushCountryMapper pushCountryMapper;


    @Autowired
    private PushLanguageMapper pushLanguageMapper;


    @Resource
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;


    @Resource
    private UserMapper userMapper;

    /**
     * 推送定时任务
     */
    @Scheduled(cron = "0/30 * *  * * ? ")
    public void executePush() throws ExecutionException, InterruptedException {
        logger.info("推送定时任务");
        //获取push 任务
        Example example = new Example(PushCountry.class);
        example.createCriteria().andEqualTo("isPush", IsPushEnum.NO_PUSH.key()).andLessThan("pushTime", new Date());
        List<PushCountry> pushCountries = pushCountryMapper.selectByExample(example);
        Integer fail = 0;
        Integer success = 0;
        if (CollectionUtils.isNotEmpty(pushCountries)) {
            for (final PushCountry pushCountry : pushCountries) {
                Push push = pushMapper.selectByPrimaryKey(pushCountry.getPushId());
                Example pushLanguageExample = new Example(PushLanguage.class);
                pushLanguageExample.createCriteria().andEqualTo("pushId", pushCountry.getPushId());
                List<PushLanguage> pushLanguages = pushLanguageMapper.selectByExample(pushLanguageExample);
                String countryId = pushCountry.getCountryId();
                List<String> strings = Splitter.on(",").trimResults().splitToList(countryId);
                List<Integer> countryIdList = Lists.transform(strings, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });
                List<PushUserDto> androidPushDto = null;
                List<PushUserDto> iosPushDto = null;
                switch (PushTypeEnum.valueOf(push.getType())) {
                    case ALL:
                        androidPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.ANDROID.key(), countryIdList, null, null);
                        iosPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.IOS.key(), countryIdList, null, null);
                        break;
                    case BOY:
                        androidPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.ANDROID.key(), countryIdList, UserGenderEnum.BOY.key(), null);
                        iosPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.IOS.key(), countryIdList, UserGenderEnum.BOY.key(), null);
                        break;
                    case GIRL:
                        androidPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.ANDROID.key(), countryIdList, UserGenderEnum.GIRL.key(), null);
                        iosPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.IOS.key(), countryIdList, UserGenderEnum.GIRL.key(), null);
                        break;
                    case TEXT:
                        List<Integer> userIdList = pushUserMapper.selectByPushId(push.getId());
                        androidPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.ANDROID.key(), countryIdList, null, userIdList);
                        iosPushDto = pushInfoMapper.selectJoinUser(PlatformTypeEnum.IOS.key(), countryIdList, null, userIdList);
                        break;
                }
                PushResult androidPushResult = androidPush(push, androidPushDto, pushLanguages);
                PushResult iosPushResult = iosPush(push, iosPushDto, pushLanguages);
                if(push.getPushWay().equals(PushWayEnum.GOLD.key())){
                    List<User> users = null;
                    switch (PushTypeEnum.valueOf(push.getType())) {
                        case ALL:
                            users = userMapper.selectUserGold(null, null);
                            break;
                        case BOY:
                            users = userMapper.selectUserGold(UserGenderEnum.BOY.key(),null);
                            break;
                        case GIRL:
                             users = userMapper.selectUserGold(UserGenderEnum.GIRL.key(), null);
                            break;
                        case TEXT:
                            List<Integer> userIdList = pushUserMapper.selectByPushId(push.getId());
                            users = userMapper.selectUserGold(null,userIdList);
                            break;
                    }
                    logger.info("用户"+users);
                    if(CollectionUtils.isNotEmpty(users)){
                        for(User user:users){
                            if(user!=null){
                                BigDecimal gold = user.getGoldNum().add(push.getGold());
                                userMapper.updateByPrimaryKeySelective(new User(user.getId(),gold,new Date()));
                            }
                        }
                    }
                }
                success = androidPushResult.getSuccess() + iosPushResult.getSuccess() + push.getSuccess();
                fail = androidPushResult.getSuccess() + iosPushResult.getFail() + push.getFail();
                pushCountryMapper.updateByPrimaryKeySelective(new PushCountry(pushCountry.getId(), IsPushEnum.PUSH.key()));
                pushMapper.updateByPrimaryKeySelective(new Push(push.getId(), IsPushEnum.PUSH.key(), fail, success));
            }
        }
    }


    private PushResult push(Push push, List<PushUserDto> pushUserDtos, List<PushLanguage> pushLanguages, PushMessage pushMessage) throws ExecutionException, InterruptedException {
        Integer success = 0;
        Integer fail = 0;
        for (final PushLanguage pushLanguage : pushLanguages) {
            Collection<PushUserDto> filterList = Collections2.filter(pushUserDtos, new Predicate<PushUserDto>() {
                @Override
                public boolean apply(PushUserDto pushUserDto) {
                    return pushUserDto.getLanguageId().contains(pushLanguage.getLanguageId().toString());
                }
            });
            if (CollectionUtils.isNotEmpty(filterList)) {
                List<PushUserDto> changeList = new ArrayList<>();
                changeList.addAll(filterList);
                pushUserDtos.removeAll(filterList);
                final List<String> pushTokenList = Lists.transform(changeList, new Function<PushUserDto, String>() {
                    @Override
                    public String apply(PushUserDto pushUserDto) {
                        return pushUserDto.getPushToken();
                    }
                });
                PushResult result = pushMessage.push(push, pushTokenList, pushLanguage.getContext());
                success += result.getSuccess();
                fail += result.getFail();
            }
        }
        if (CollectionUtils.isNotEmpty(pushUserDtos)) {
            final List<String> pushTokenList = Lists.transform(pushUserDtos, new Function<PushUserDto, String>() {
                @Override
                public String apply(PushUserDto pushUserDto) {
                    return pushUserDto.getPushToken();
                }
            });
            PushResult result = pushMessage.push(push, pushTokenList, push.getContent());
            success += result.getSuccess();
            fail += result.getFail();
        }
        return new PushResult(success, fail);
    }


    public PushResult androidPush(final Push push, List<PushUserDto> androidPushDto, List<PushLanguage> pushLanguages) throws ExecutionException, InterruptedException {
        PushResult androidPushResult = new PushResult(0, 0);
        if (CollectionUtils.isNotEmpty(androidPushDto)) {
            androidPushResult = push(push, androidPushDto, pushLanguages, new PushMessage() {
                @Override
                public PushResult push(final Push push, final List<String> pushTokenList, final String context) throws ExecutionException, InterruptedException {
                    Future<PushResult> submit = threadPoolTaskExecutor.submit(new Callable<PushResult>() {
                        @Override
                        public PushResult call() throws Exception {
                            MulticastResult multicastResult = GoogleGcmPush.push(new GoogleGcmPush.PushMessage(push.getMode(), context), pushTokenList);
                            return new PushResult(multicastResult.getSuccess(), multicastResult.getFailure());
                        }
                    });
                    return submit.get();
                }
            });
        }
        return androidPushResult;
    }


    public PushResult iosPush(final Push push, List<PushUserDto> iosPushDto, List<PushLanguage> pushLanguages) throws ExecutionException, InterruptedException {
        PushResult iosPushResult = new PushResult(0, 0);
        if (CollectionUtils.isNotEmpty(iosPushDto)) {
            iosPushResult = push(push, iosPushDto, pushLanguages, new PushMessage() {
                @Override
                public PushResult push(Push push, final List<String> pushTokenList, final String context) throws ExecutionException, InterruptedException {
                    Future<PushResult> result = threadPoolTaskExecutor.submit(new Callable<PushResult>() {
                        @Override
                        public PushResult call() throws Exception {
                            List<String> isoTokenList = Lists.transform(pushTokenList, new Function<String, String>() {
                                @Override
                                public String apply(String input) {
                                    return input.replace(" ", "");
                                }
                            });
                            List<Integer> iosResult = iosPush.sendPush(isoTokenList, context);
                            return new PushResult(iosResult.get(1), iosResult.get(0));
                        }
                    });
                    return result.get();
                }
            });
        }
        return iosPushResult;
    }


}
