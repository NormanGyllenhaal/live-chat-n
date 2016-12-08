package com.rcplatform.livechat.controller;


import com.rcplatform.livechat.common.exception.BaseException;
import com.rcplatform.livechat.model.Admin;
import com.rcplatform.livechat.service.IAdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by yang peng on 2016/9/5.
 */
@RestController
@RequestMapping("admin")
public class AdminController {


    @Resource
    private IAdminService adminService;

    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value="login",method = RequestMethod.POST)
    @ResponseBody
    public Admin login(@RequestBody Admin admin) throws BaseException {
       return  adminService.login(admin.getEmail(), admin.getPassword());
    }



    /**
     * 获取管理员信息
     * @param adminId
     * @return
     */
    @RequestMapping(value="getAdmin",method = RequestMethod.GET)
    @ResponseBody
    public Admin getAdmin(Integer adminId) throws Exception {
       return adminService.getAdmin(adminId);
    }



    /**
     * 修改用户密码
     * @param adminId
     * @param password
     * @return
     */
    @RequestMapping(value="modifyPassword",method = RequestMethod.GET)
    @ResponseBody
    public void modifyPassword(Integer adminId,String password,String newPassword){
         adminService.modifyPassword(adminId,password,newPassword);
    }
}
