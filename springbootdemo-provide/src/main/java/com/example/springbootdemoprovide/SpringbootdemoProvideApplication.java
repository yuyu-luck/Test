package com.example.springbootdemoprovide;

import com.example.springbootdemoprovide.user.model.User;
import com.example.springbootdemoprovide.user.service.UserService;
import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.example.springbootdemoprovide.user.mapper"})
//@EnableCaching
//@EnableScheduling //这个注解的作用就是开启定时任务功能 利用springtask即时spring的自己的技术
public class SpringbootdemoProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoProvideApplication.class, args);
    }

}
