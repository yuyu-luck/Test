package com.example.springbootdemoprovide.user.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class SendMsg {
    private static final String KILL_QUEUE="killQueue";
    private static final String DEAD_QUEUE="deadQueue";

    private static final String KILL_EXCHANGE="killExchange";
    private static final String DEAD_EXCHANGE="deadExchange";

    private static final String KILL_ROUTING="killRouting";
    private static final String DEAD_ROUTING="deadRouting";


    @Bean
    public Queue killQueue(){
        Map<String, Object> arguments = new HashMap<String, Object>();
        arguments.put("x-message-ttl", 10000);//message在该队列queue的存活时间最大为10秒
        arguments.put("x-dead-letter-exchange", DEAD_EXCHANGE); //x-dead-letter-exchange参数是设置该队列的死信交换器（DLX）
        arguments.put("x-dead-letter-routing-key", DEAD_ROUTING);//x-dead-letter-routing-key参数是给这个DLX指定路由键
        //durable 设置为true 实现消息持久化
        return new Queue(KILL_QUEUE, true, false, false, arguments);
    }

    @Bean
    public DirectExchange killExchange(){
        return new DirectExchange(KILL_EXCHANGE);
    }

    @Bean
    public Binding killBinding(){
        return BindingBuilder.bind(killQueue()).to(killExchange()).with(KILL_ROUTING);
    }

    @Bean
    public Queue deadQueue(){
        return new Queue(DEAD_QUEUE,true);
    }

    @Bean
    public DirectExchange deadExchange(){
        return new DirectExchange(DEAD_EXCHANGE);
    }

    @Bean
    public Binding deadBinding(){
        return BindingBuilder.bind(deadQueue()).to(deadExchange()).with(DEAD_ROUTING);
    }



}
