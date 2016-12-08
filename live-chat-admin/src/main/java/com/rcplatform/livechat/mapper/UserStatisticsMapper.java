package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.UserStatistics;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserStatisticsMapper extends CommonMapper<UserStatistics> {


    /**
     * 根据日前区间查询统计数据
     * @return
     */
    List<UserStatistics> selectBetweenTime(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);


    /**
     * 查询用户数据
     * @return
     */
    UserStatistics selectFromUser(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}