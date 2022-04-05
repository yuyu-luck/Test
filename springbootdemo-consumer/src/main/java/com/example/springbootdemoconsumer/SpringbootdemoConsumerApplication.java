package com.example.springbootdemoconsumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.example.springbootdemoconsumer.fegin"})
public class SpringbootdemoConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoConsumerApplication.class, args);
    }

}
