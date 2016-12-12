package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.UserKeep;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserKeepMapper extends CommonMapper<UserKeep> {


   UserKeep selectUserRecord(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}