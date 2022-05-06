package com.example.springbootdemoprovide.user.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * spring提供的SpringTask定时任务
 */
@Component
public class SpringTaskJob {

    @Scheduled(cron ="0/1 * * * * ?")
    public void task(){
        System.out.println(Thread.currentThread().getName()+"韩波hhh");
    }
}

