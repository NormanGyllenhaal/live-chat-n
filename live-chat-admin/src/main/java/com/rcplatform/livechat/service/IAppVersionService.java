package com.rcplatform.livechat.service;


import com.rcplatform.livechat.model.AppVersion;

import java.util.List;

/**
 * Created by yang peng on 2016/9/27.
 */
public interface IAppVersionService {


    List getAppVersion(Integer adminId);


    List updateAppVersion(AppVersion appVersion);


}
