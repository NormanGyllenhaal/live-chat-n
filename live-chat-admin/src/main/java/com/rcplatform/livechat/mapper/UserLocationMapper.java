package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.model.UserLocation;

public interface UserLocationMapper extends CommonMapper<UserLocation> {


    /**
     * 根据id更新
     * @param userLocation
     * @return
     */
    Integer updateByUserId(UserLocation userLocation);
}