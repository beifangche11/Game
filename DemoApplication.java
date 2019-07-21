package com.heartgo.demo;

import com.heartgo.demo.client.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public UserInfoClient userInfoClient ()throws Exception{
        UserInfoClient userInfoClient=new UserInfoClient();
        userInfoClient.initialize();
        userInfoClient.deployAssetAndRecordAddr();
        return userInfoClient;
    }

}
