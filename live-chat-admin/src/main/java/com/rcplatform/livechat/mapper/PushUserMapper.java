package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.PushUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PushUserMapper extends CommonMapper<PushUser> {

    List<Integer> selectByPushId(@Param("pushId") Integer pushId);
}