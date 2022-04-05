package com.example.springbootdemoconsumer.receive;

import com.example.springbootdemoconsumer.fegin.UserFegin;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "deadQueue")
public class RecevieMsg {
    @Autowired
    private UserFegin userFegin;

    @RabbitHandler
    public void handleMsg(String tokenuuid){
        userFegin.login(tokenuuid);
    }
}
