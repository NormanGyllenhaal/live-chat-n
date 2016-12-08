package com.rcplatform.livechat.controller;

import com.rcplatform.livechat.common.enums.StatEnum;
import com.rcplatform.livechat.common.response.Response;

/**
 * Created by yang peng on 2016/11/8.
 */
public class BaseController {


    /**
     * 带有数据体的应答
     *
     * @param statEnum 枚举类型
     * @param body 应答体
     * @param <T>
     * @return 返回数据结构
     */
    public <T> Response<T> result(StatEnum statEnum, T body){
        return new Response<T>(statEnum.key(),statEnum.desc(),body);
    }


    /**
     *
     * 不带有数据体的应答
     *
     * @param statEnum 枚举类型
     * @param <T>
     * @return 返回应答码和提示
     */
    public <T> Response<T> result(StatEnum statEnum){
        return new Response<T>(statEnum.key(),statEnum.desc());
    }


    /**
     * 正常情况下不校验参数的一站式返回结果
     *
     * @param body 应答体
     * @return 返回数据结构
     */
    public <T> Response<T> success(T body) {
        return result(StatEnum.STAT_SUCCESS,body);
    }

    /**
     * 程序发生异常时可调用此方法返回数据体
     *
     * @param <T>
     * @return 返回错误时数据体
     */
    public <T> Response<T> fail() {
        return result(StatEnum.STAT_ERROR);
    }


}
