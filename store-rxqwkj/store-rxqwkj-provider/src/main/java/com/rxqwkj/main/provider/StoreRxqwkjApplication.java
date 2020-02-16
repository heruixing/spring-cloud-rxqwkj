package com.rxqwkj.main.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by heruixing on 2018/4/9 .
 */

@EnableResourceServer
@SpringCloudApplication
public class StoreRxqwkjApplication {
    public static void main (String[] args){
        SpringApplication.run(StoreRxqwkjApplication.class, args);
    }
}
