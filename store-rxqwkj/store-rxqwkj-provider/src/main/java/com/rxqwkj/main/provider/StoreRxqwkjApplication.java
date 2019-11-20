package com.rxqwkj.main.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by heruixing on 2018/4/9 .
 */

@EnableSwagger2
@EnableResourceServer
@SpringCloudApplication
public class StoreRxqwkjApplication {
    public static void main (String[] args){
        SpringApplication.run(StoreRxqwkjApplication.class, args);
    }
}
