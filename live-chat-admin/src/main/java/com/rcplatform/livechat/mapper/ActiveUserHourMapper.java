package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.ActiveUserHour;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ActiveUserHourMapper extends CommonMapper<ActiveUserHour> {


    /**
     * 查询用户活跃
     * @return
     */
    ActiveUserHour selectUserApiRecord(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);


    /**
     * 查询用户活跃
     * @return
     */
    List<ActiveUserHour> selectActiveHour(@Param("date") Date date);
}