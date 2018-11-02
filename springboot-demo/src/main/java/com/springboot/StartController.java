package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 * Created by yangsong on 2018/6/12.
 */

@SpringBootApplication
@EnableEurekaServer
@EnableCaching
@EnableWebSecurity
public class StartController {

    public static void main(String[] args) {
        SpringApplication.run(StartController.class,args);
    }
}
