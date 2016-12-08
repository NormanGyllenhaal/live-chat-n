package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.UserVerification;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserVerificationMapper extends CommonMapper<UserVerification> {

    /**
     * 根据用户id更新token数据
     * @param userVerification
     * @return
     */
    Integer updateByUserId(UserVerification userVerification);


    /**
     * 获取用户的邮箱token和过期时间
     * @param appId
     * @param userAccount
     * @return
     */
    Map<String,Object> selectJoinUser(@Param("appId") Integer appId, @Param("userAccount") String userAccount);

}