package com.rcplatform.livechat.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.rcplatform.livechat.common.enums.StatEnum;
import com.rcplatform.livechat.common.response.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * Created by yang peng on 2016/9/30.
 */
public class DataHttpMessageConverter extends FastJsonHttpMessageConverter {



    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        Response<Object> response = new Response<>(StatEnum.STAT_SUCCESS.key(), StatEnum.STAT_SUCCESS.desc(),obj);
        HttpHeaders headers = outputMessage.getHeaders();
        ByteArrayOutputStream outnew = new ByteArrayOutputStream();
        int len = JSON.writeJSONString(outnew, getFastJsonConfig().getCharset(), response, getFastJsonConfig().getSerializeConfig(), getFastJsonConfig().getSerializeFilters(), getFastJsonConfig().getDateFormat(), JSON.DEFAULT_GENERATE_FEATURE, getFastJsonConfig().getSerializerFeatures());
        headers.setContentLength((long)len);
        OutputStream out = outputMessage.getBody();
        outnew.writeTo(out);
        outnew.close();
    }



}
