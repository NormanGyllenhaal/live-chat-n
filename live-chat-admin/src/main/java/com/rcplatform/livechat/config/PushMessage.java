package com.rcplatform.livechat.config;


import com.rcplatform.livechat.common.push.PushResult;
import com.rcplatform.livechat.model.Push;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by yang peng on 2016/11/11.
 */
public interface PushMessage {


    PushResult push(Push push, List<String> pushTokenList, String context) throws ExecutionException, InterruptedException;
}
