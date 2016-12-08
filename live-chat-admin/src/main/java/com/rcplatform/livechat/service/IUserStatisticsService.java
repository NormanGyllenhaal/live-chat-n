package com.rcplatform.livechat.service;


import com.rcplatform.livechat.dto.request.StatisticsReqDto;
import com.rcplatform.livechat.model.UserStatistics;

import java.util.List;

/**
 * Created by yang peng on 2016/8/26.
 */
public interface IUserStatisticsService {


    /**
     * 返回用户统计数据
     * @param statisticsReqDto
     * @return
     */
    List getUserStatistics(StatisticsReqDto statisticsReqDto);


    /**
     *
     * @return
     */
    UserStatistics findUserNow(Integer adminId);
}
