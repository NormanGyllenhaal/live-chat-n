package com.rcplatform.livechat.common.util;

/**
 * Created by yang peng on 2016/8/3.
 */
public class StringUtil {


    /**
     * 自动拼合key
     * @param objs
     * @return
     */
    public static String buildString(Object... objs){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<objs.length;i++){
            if(i==0){
                stringBuilder.append(objs[0]);
            }else{
                stringBuilder.append(":").append(objs[i]);
            }
        }
        return stringBuilder.toString();
    }
}
