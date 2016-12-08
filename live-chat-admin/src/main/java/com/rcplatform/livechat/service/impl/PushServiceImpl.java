package com.rcplatform.livechat.service.impl;

import com.github.pagehelper.PageHelper;
import com.google.common.base.Joiner;
import com.rcplatform.livechat.common.enums.IsPushEnum;
import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.common.util.DateUtil;
import com.rcplatform.livechat.dto.request.PushDto;
import com.rcplatform.livechat.mapper.CountryMapper;
import com.rcplatform.livechat.mapper.PushCountryMapper;
import com.rcplatform.livechat.mapper.PushLanguageMapper;
import com.rcplatform.livechat.mapper.PushMapper;
import com.rcplatform.livechat.model.Country;
import com.rcplatform.livechat.model.Push;
import com.rcplatform.livechat.model.PushCountry;
import com.rcplatform.livechat.model.PushLanguage;
import com.rcplatform.livechat.service.AbstractService;
import com.rcplatform.livechat.service.IPushService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/11.
 */
@Service
public class PushServiceImpl extends AbstractService implements IPushService {

    @Resource
    private PushMapper pushMapper;

    @Resource
    private PushLanguageMapper pushLanguageMapper;

    @Resource
    private PushCountryMapper pushCountryMapper;

    @Resource
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Resource
    private CountryMapper countryMapper;


    private static final Integer DAY_HOUR = 24;

    @Override
    public void addPush(final PushDto pushDto) {
        pushMapper.insertSelective(pushDto);
        List<PushLanguage> pushLanguages = pushDto.getPushLanguages();
        for (PushLanguage pushLanguage : pushLanguages) {
            pushLanguage.setCreateTime(new Date());
            pushLanguage.setPushId(pushDto.getId());
        }
        pushLanguageMapper.insertList(pushLanguages);
        threadPoolTaskExecutor.execute(new Runnable() {
            @Override
            public void run() {
                List<Country> countries = countryMapper.selectAll();
                Map<Integer,List<Integer>> map = new HashedMap();
                for(Country country:countries){
                    Integer timeDifference = country.getTimeDifference();
                    if(map.containsKey(timeDifference)){
                        List<Integer> countryIdList = map.get(timeDifference);
                        countryIdList.add(country.getId());
                    }else{
                        List<Integer> countryIdList= new ArrayList<>();
                        countryIdList.add(country.getId());
                        map.put(timeDifference,countryIdList);
                    }
                }
                List<PushCountry> lists = new ArrayList<PushCountry>();
                for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
                    String countryIdStr = Joiner.on(",").skipNulls().join(entry.getValue());
                    int hour = entry.getKey() <= 0 ? Math.abs(entry.getKey()) : DAY_HOUR - entry.getKey();
                    Date datePlusHour = DateUtil.getDatePlusHour(pushDto.getPushTime(), hour);
                    PushCountry pushCountry = new PushCountry(pushDto.getId(), countryIdStr, IsPushEnum.NO_PUSH.key(), datePlusHour,new Date());
                    lists.add(pushCountry);
                }
                pushCountryMapper.insertList(lists);
            }
        });
    }


    @Override
    public Page getPushHistory(Integer adminId, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize, "create_time desc");
        List<Push> pushList = pushMapper.selectAll();
        return getPage(pushList);
    }
}
