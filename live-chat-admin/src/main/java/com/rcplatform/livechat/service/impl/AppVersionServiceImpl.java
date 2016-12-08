package com.rcplatform.livechat.service.impl;

import com.rcplatform.livechat.mapper.AppVersionMapper;
import com.rcplatform.livechat.model.AppVersion;
import com.rcplatform.livechat.service.AbstractService;
import com.rcplatform.livechat.service.IAppVersionService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yang peng on 2016/9/27.
 */
@Component
public class AppVersionServiceImpl extends AbstractService implements IAppVersionService {


    @Resource
    private AppVersionMapper appVersionMapper;


    @Override
    public List getAppVersion(Integer adminId) {
        return appVersionMapper.selectAll();
    }


    @Override
    public List updateAppVersion(AppVersion appVersion) {
        appVersionMapper.updateByPrimaryKeySelective(appVersion);
        return appVersionMapper.selectAll();
    }
}
