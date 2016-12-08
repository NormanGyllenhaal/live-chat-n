package com.rcplatform.livechat.mapper;

import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.MatchNumDay;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface MatchNumDayMapper extends CommonMapper<MatchNumDay> {



    MatchNumDay selectJoinMatchStat(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}