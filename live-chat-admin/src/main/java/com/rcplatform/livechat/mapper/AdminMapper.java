package com.rcplatform.livechat.mapper;

import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.dto.response.AdminFunctionDto;
import com.rcplatform.livechat.model.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper extends CommonMapper<Admin> {


    AdminFunctionDto selectJoinFunction(@Param("email") String email, @Param("password") String password);
}