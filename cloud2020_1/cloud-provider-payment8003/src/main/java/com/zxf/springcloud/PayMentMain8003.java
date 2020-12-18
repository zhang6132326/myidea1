package com.zxf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMentMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8003.class,args);
    }
}
