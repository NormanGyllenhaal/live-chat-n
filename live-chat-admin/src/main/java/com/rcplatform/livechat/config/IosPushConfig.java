package com.rcplatform.livechat.config;

import com.rcplatform.livechat.common.push.IosPush;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yang peng on 2016/11/7.
 */
@Configuration
public class IosPushConfig {

    @Value("${ios.password}")
    private String password;

    @Value("${ios.path}")
    private String iosPushPath;

    @Bean
    public IosPush iosPush(){
        IosPush iosPush = new IosPush();
        iosPush.setPassword(password);
        iosPush.setPath(iosPushPath);
        return iosPush;
    }
}
