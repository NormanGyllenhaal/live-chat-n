package com.rcplatform.livechat.service;


import com.rcplatform.livechat.model.App;

import java.util.List;

/**
 * Created by yang peng on 2016/9/27.
 */
public interface IAppService {


    List getApp(Integer adminId);


    List addApp(App app);
}
