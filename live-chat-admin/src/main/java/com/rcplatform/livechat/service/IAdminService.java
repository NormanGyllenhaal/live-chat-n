package com.rcplatform.livechat.service;


import com.rcplatform.livechat.common.exception.BaseException;
import com.rcplatform.livechat.model.Admin;

/**
 * Created by yang peng on 2016/9/5.
 */
public interface IAdminService {

    /**
     * 管理员登录
     * @param email
     * @param password
     * @return
     */
    Admin login(String email, String password) throws BaseException;


    /**
     * 获取管理员信息
     * @param adminId
     * @return
     */
   Admin getAdmin(Integer adminId);


    /**
     * 修改管理员密码
     * @param adminId
     * @param password
     * @return
     */
   void modifyPassword(Integer adminId, String password, String newPassword);
}
