package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.PayStatDay;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface PayStatDayMapper extends CommonMapper<PayStatDay> {


    PayStatDay selectPayRecord(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}