package com.wuhu.meizuphone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wuhu.meizujdbc.dao")
public class MeizuPhoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeizuPhoneApplication.class, args);
    }

}
