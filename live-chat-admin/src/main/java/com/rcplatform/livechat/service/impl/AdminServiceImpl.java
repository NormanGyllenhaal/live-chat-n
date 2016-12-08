package com.rcplatform.livechat.service.impl;


import com.rcplatform.livechat.common.constant.RedisKeyConstant;
import com.rcplatform.livechat.common.enums.StatEnum;
import com.rcplatform.livechat.common.exception.BaseException;
import com.rcplatform.livechat.common.util.MD5;
import com.rcplatform.livechat.common.util.StringUtil;
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
    public Admin login(String email, String password) throws BaseException {
        Admin admin = adminMapper.selectOne(new Admin(MD5.getMD5Code(password), email));
        if(admin==null){
            throw new BaseException(StatEnum.PASSWORD_ERROR);
        }
        String adminKey = StringUtil.buildString(RedisKeyConstant.APP_NAME, RedisKeyConstant.ADMIN);
        redisTemplate.opsForSet().add(adminKey,admin.getId().toString());
        return admin;
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
