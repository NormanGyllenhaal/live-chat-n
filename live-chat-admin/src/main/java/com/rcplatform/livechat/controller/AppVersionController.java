package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.model.AppVersion;
import com.rcplatform.livechat.service.IAppVersionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 版本
 * Createy yang peng on 2016/9/27.
 */
@RequestMapping("appVersion")
@RestController
public class AppVersionController {


    @Resource
    private IAppVersionService appVersionService;


    /**
     * 获取版本信息
     * @param adminId
     * @return
     */
    @RequestMapping("getAppVersion")
    @ResponseBody
    public List getAppVersion(Integer adminId){
          return appVersionService.getAppVersion(adminId);
    }


    /**
     * 更新版本信息
     * @param appVersion
     * @return
     */
    @RequestMapping("updateAppVersion")
    @ResponseBody
    public List updateAppVersion(@RequestBody AppVersion appVersion){
        return appVersionService.updateAppVersion(appVersion);
    }

}
