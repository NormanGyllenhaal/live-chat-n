package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.dto.response.UserPayRecordAdminDto;
import com.rcplatform.livechat.model.UserPayRecord;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserPayRecordMapper extends CommonMapper<UserPayRecord> {


    List<UserPayRecordAdminDto> selectJoinUser(@Param("beginTime") Date beginTime, @Param("endTime") Date endTime);
}