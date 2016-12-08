package com.rcplatform.livechat.config;

import com.rcplatform.livechat.common.enums.StatEnum;
import com.rcplatform.livechat.common.exception.BaseException;
import com.rcplatform.livechat.common.response.Response;
import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * Created by yang peng on 2016/9/30.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response<Object> defaultErrorHandler(HttpServletRequest req, Exception e) {
        Response<Object> response;
        if(e instanceof BaseException){
             response = new Response<>(((BaseException) e).getStatEnum().key(), ((BaseException) e).getStatEnum().desc());
        }else{
            logger.error("服务器异常",e);
            response = new Response<>(StatEnum.STAT_ERROR.key(), StatEnum.STAT_ERROR.desc());
        }
        return response;
    }
}
