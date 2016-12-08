package com.rcplatform.livechat.service;


import com.rcplatform.livechat.common.response.Page;
import com.rcplatform.livechat.dto.request.PushDto;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2016/9/11.
 */
public interface IPushService {

    @Transactional
    void addPush(PushDto pushDto);


    Page getPushHistory(Integer adminId, Integer pageNo, Integer pageSize);
}
