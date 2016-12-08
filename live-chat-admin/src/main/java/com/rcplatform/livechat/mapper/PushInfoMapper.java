package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.dto.response.PushUserDto;
import com.rcplatform.livechat.model.PushInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PushInfoMapper extends CommonMapper<PushInfo> {


    /**
     * 更新pushtoken
     * @return
     */
    Integer updatePushTokenByUserId(PushInfo pushInfo);


    /**
     * 获取pushToken
     * @param platformType
     * @param gender
     * @param userIdList
     * @return
     */
    List<PushInfo> selectPushToken(@Param("platformType") Integer platformType, @Param("gender") Integer gender, @Param("userIdList") List<Integer> userIdList);


    /**
     * 根据国家id查询用户token
     * @param platformType
     * @param list
     * @return
     */
    List<PushUserDto> selectJoinUser(@Param("platformType") Integer platformType, @Param("list") List<Integer> list, @Param("gender") Integer gender, @Param("userIdList") List<Integer> userIdList);



}