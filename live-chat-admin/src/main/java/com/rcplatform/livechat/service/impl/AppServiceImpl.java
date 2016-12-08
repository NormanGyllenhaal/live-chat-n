package com.rcplatform.livechat.service.impl;


import com.rcplatform.livechat.mapper.AppMapper;
import com.rcplatform.livechat.model.App;
import com.rcplatform.livechat.service.AbstractService;
import com.rcplatform.livechat.service.IAppService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yang peng on 2016/9/27.
 */
@Component
public class AppServiceImpl extends AbstractService implements IAppService {


    @Resource
    private AppMapper appMapper;


    @Override
    public List getApp(Integer adminId) {
        return appMapper.selectAll();
    }



    @Override
    public List addApp(App app) {
        appMapper.insert(app);
        return appMapper.selectAll();
    }
}
