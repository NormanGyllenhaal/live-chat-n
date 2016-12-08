package com.rcplatform.livechat.service.impl;


import com.rcplatform.livechat.common.util.DateUtil;
import com.rcplatform.livechat.dto.request.StatisticsReqDto;
import com.rcplatform.livechat.mapper.UserStatisticsMapper;
import com.rcplatform.livechat.model.UserStatistics;
import com.rcplatform.livechat.service.IUserStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yang peng on 2016/8/26.
 */
@Service
public class UserStatisticsServiceImpl implements IUserStatisticsService {

    @Resource
    private UserStatisticsMapper userStatisticsMapper;




    /**
     * 获取用户数据统计
     * @param statisticsReqDto
     * @return
     */
    @Override
    public List getUserStatistics(StatisticsReqDto statisticsReqDto) {
        return userStatisticsMapper.selectBetweenTime(statisticsReqDto.getBeginDate(),statisticsReqDto.getEndDate());
    }



    public UserStatistics findUserNow(Integer adminId){
        Date endDate = new Date();
        UserStatistics userStatistics = userStatisticsMapper.selectFromUser(DateUtil.getDay(endDate),endDate);
        return userStatistics;
    }



}
