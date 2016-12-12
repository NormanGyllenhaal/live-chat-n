package com.rcplatform.livechat.task;


import com.rcplatform.livechat.common.util.DateUtil;
import com.rcplatform.livechat.mapper.*;
import com.rcplatform.livechat.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by yang peng on 2016/8/26.
 */
@Component
public class TimedTask {


    private Logger logger = LoggerFactory.getLogger(TimedTask.class);


    @Resource
    private UserStatisticsMapper userStatisticsMapper;
    
    
    @Resource
    private StatisticsDayMapper statisticsDayMapper;

    @Resource
    private PayStatDayMapper payStatDayMapper;


    @Resource
    private MatchNumDayMapper matchNumDayMapper;


    @Resource
    private UserKeepMapper userKeepMapper;


    @Resource
    private ActiveUserHourMapper activeUserHourMapper;





    @Scheduled(cron="0 0 0 * * ?")
    public void userStatisticsTask() {
        Date endDate = new Date();
        Date beginDate = DateUtil.getDatePlusDays(endDate,-1);
        UserStatistics userStatistics = userStatisticsMapper.selectFromUser(DateUtil.getDatePlusDays(endDate,-1),endDate);
        userStatistics.setCreateTime(beginDate);
        userStatisticsMapper.insertSelective(userStatistics);
        UserKeep userKeep = userKeepMapper.selectUserRecord(DateUtil.getDatePlusDays(endDate,-1),endDate);
        userKeep.setCreateTime(beginDate);
        userKeepMapper.insertSelective(userKeep);
    }



    @Scheduled(cron="0 0 0 * * ?")
    public void statisticsDayTask(){
        Date endDate = new Date();
        Date beginDate = DateUtil.getDatePlusDays(endDate,-1);
        StatisticsDay statisticsDay = statisticsDayMapper.selectFromVideoRecord(beginDate,endDate);
        Integer videoBefriendCount = statisticsDayMapper.selectFromAddFriendRecord(beginDate,endDate);
        StatisticsDay consumeRecode = statisticsDayMapper.selectFromConsumeRecord(beginDate,endDate);
        StatisticsDay bothFriendStatistics = statisticsDayMapper.selectUserFriend(beginDate,endDate);
        statisticsDay.setVideoBefriendCount(videoBefriendCount);
        statisticsDay.setMatchPagePayPeople(consumeRecode.getMatchPagePayPeople());
        statisticsDay.setMatchPagePayCount(consumeRecode.getMatchPagePayCount());
        statisticsDay.setGirlPayCount(consumeRecode.getGirlPayCount());
        statisticsDay.setGirlPayPeople(consumeRecode.getGirlPayPeople());
        statisticsDay.setBoyPayCount(consumeRecode.getBoyPayCount());
        statisticsDay.setBoyPayPeople(consumeRecode.getBoyPayPeople());
        statisticsDay.setMatchGold(consumeRecode.getMatchGold());
        statisticsDay.setGirlMatchGold(consumeRecode.getGirlMatchGold());
        statisticsDay.setBoyMatchGold(consumeRecode.getBoyMatchGold());
        statisticsDay.setIosMatchGold(consumeRecode.getIosMatchGold());
        statisticsDay.setAndroidMatchGold(consumeRecode.getAndroidMatchGold());
        statisticsDay.setFriendVideoCount(statisticsDay.getFriendVideoPeople()/2);
        statisticsDay.setBothFriendTotal(bothFriendStatistics.getBothFriendTotal());
        statisticsDay.setBothFriendDay(bothFriendStatistics.getBothFriendDay());
        statisticsDay.setCreateTime(beginDate);
        statisticsDayMapper.insertSelective(statisticsDay);
    }



    @Scheduled(cron="0 0 0 * * ?")
    public void payStatDayTask(){
        Date endDate = new Date();
        Date beginDate = DateUtil.getDatePlusDays(endDate,-1);
        PayStatDay payStatDay = payStatDayMapper.selectPayRecord(beginDate,endDate);
        payStatDay.setCreateTime(beginDate);
        payStatDayMapper.insertSelective(payStatDay);
    }



    @Scheduled(cron="0 0 0 * * ?")
    public void matchNumDayTask(){
        Date endDate = new Date();
        Date beginDate = DateUtil.getDatePlusDays(endDate,-1);
        MatchNumDay matchNumDay = matchNumDayMapper.selectJoinMatchStat(beginDate,endDate);
        matchNumDay.setCreateTime(beginDate);
        matchNumDayMapper.insertSelective(matchNumDay);
    }




    @Scheduled(cron = "0 0 0/1 * * ?")
    public void userActiveHourTask(){
        ActiveUserHour activeUserHour = activeUserHourMapper.selectUserApiRecord(DateUtil.getDatePlusHour(new Date(), -1), new Date());
        activeUserHourMapper.insertSelective(activeUserHour);
    }




}
