package com.example.springbootdemogetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootdemoGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoGetwayApplication.class, args);
    }

}
