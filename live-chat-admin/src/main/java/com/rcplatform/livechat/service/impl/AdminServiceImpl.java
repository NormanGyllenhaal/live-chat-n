package com.rcplatform.livechat.service.impl;


import com.rcplatform.livechat.common.constant.RedisKeyConstant;
import com.rcplatform.livechat.common.enums.StatEnum;
import com.rcplatform.livechat.common.exception.BaseException;
import com.rcplatform.livechat.common.util.MD5;
import com.rcplatform.livechat.common.util.StringUtil;
import com.rcplatform.livechat.dto.response.AdminFunctionDto;
import com.rcplatform.livechat.mapper.AdminMapper;
import com.rcplatform.livechat.model.Admin;
import com.rcplatform.livechat.service.AbstractService;
import com.rcplatform.livechat.service.IAdminService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * Created by yang peng on 2016/9/5.
 */
@Component
public class AdminServiceImpl extends AbstractService implements IAdminService {


    @Resource
    private AdminMapper adminMapper;


    @Resource
    protected RedisTemplate<String,Object> redisTemplate;


    @Override
    public AdminFunctionDto login(String email, String password) throws BaseException {
        AdminFunctionDto adminFunctionDto = adminMapper.selectJoinFunction(email, MD5.getMD5Code(password));
        if(adminFunctionDto ==null){
            throw new BaseException(StatEnum.PASSWORD_ERROR);
        }
        String adminKey = StringUtil.buildString(RedisKeyConstant.APP_NAME, RedisKeyConstant.ADMIN);
        redisTemplate.opsForSet().add(adminKey,adminFunctionDto.getId().toString());
        return adminFunctionDto;
    }


    @Override
    public Admin getAdmin(Integer adminId) {
        Admin admin = adminMapper.selectByPrimaryKey(adminId);
        admin.setPassword(null);
        return admin;
    }



    @Override
    public void modifyPassword(Integer adminId, String password, String newPassword) {
        Admin admin = adminMapper.selectByPrimaryKey(adminId);
        if (admin.getPassword().equals(MD5.getMD5Code(password))) {
            adminMapper.updateByPrimaryKey(new Admin(adminId, MD5.getMD5Code(newPassword)));
        }
    }
}
