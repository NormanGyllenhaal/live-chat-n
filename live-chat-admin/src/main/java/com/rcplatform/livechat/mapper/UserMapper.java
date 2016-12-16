package com.rcplatform.livechat.mapper;


import com.rcplatform.livechat.common.mybatis.mapper.CommonMapper;
import com.rcplatform.livechat.dto.response.UserReportResp;
import com.rcplatform.livechat.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends CommonMapper<User> {

    /**
     * 根据第三方id查询用户信息
     * @param threePartyId
     * @param appId
     * @return
     */
    User selectByThreePartyId(@Param("threePartyId") String threePartyId, @Param("appId") Integer appId);


    /**
     * 更新密码
     * @param appId
     * @param password
     * @param userAccount
     * @return
     */
    Integer updatePassword(@Param("appId") Integer appId, @Param("password") String password, @Param("userAccount") String userAccount);

    /**
     * 根据用户id和密码查询数量
     * @param userId
     * @param password
     * @return
     */
    Integer selectCountByIdAndPassword(@Param("userId") Integer userId, @Param("password") String password);


    /**
     * 更新密码根据用户id
     * @param userId
     * @param password
     * @return
     */
    Integer updatePasswordById(@Param("userId") Integer userId, @Param("password") String password);





    List<User> selectUserGold(@Param("gender") Integer gender, @Param("userIdList") List<Integer> userIdList);




    List<UserReportResp> selectJoin(@Param("userIdList")List<Integer> userIdList);
}