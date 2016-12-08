package com.rcplatform.livechat.common.util;


import com.rcplatform.livechat.common.constant.RedisKeyConstant;

/**
 * Created by yang peng on 2016/11/28.
 */
public class RedisKeyFactory {


    public static String getKey(Object...objects){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(RedisKeyConstant.APP_NAME);
        for(int i=0;i<objects.length;i++){
            stringBuilder.append(":").append(objects[i]);
        }
        return stringBuilder.toString();
    }
}
