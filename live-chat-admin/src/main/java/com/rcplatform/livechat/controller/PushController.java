package com.rcplatform.livechat.controller;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.common.response.Response;
import com.rcplatform.livechat.dto.request.PushDto;
import com.rcplatform.livechat.service.IPushService;
import org.omg.CORBA.Object;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/9/10.
 */
@RequestMapping("push")
@RestController
public class PushController extends BaseController{

    @Resource
    private IPushService pushService;

    @RequestMapping("addPush")
    @ResponseBody
    public Response<Object> addPush(@RequestBody PushDto pushDto){
        pushService.addPush(pushDto);
        return success(null);
    }





    @RequestMapping("/getPushHistory")
    @ResponseBody
    public Page getPushHistory(Integer adminId, Integer pageNo, Integer pageSize){
        int num = pageNo == null ? 1 : pageNo;
        int size = pageSize == null ? 10 :  pageSize;
        return pushService.getPushHistory(adminId,num,size);
    }
}
