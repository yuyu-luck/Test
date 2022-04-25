package com.example.springbootdemoprovide.user.service.imp;

import com.example.springbootdemoprovide.user.mapper.TokenMapper;
import com.example.springbootdemoprovide.user.model.Token;
import com.example.springbootdemoprovide.user.service.TokenService;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenMapper tokenMapper;
//    @Autowired
//    private RabbitTemplate rabbitTemplate;

    @Override
    public int insert(Token record) {
        return tokenMapper.insert(record);
    }

//    @Override
//    public String searchToken(String tokenuuid) {
//       String name= tokenMapper.searchToken(tokenuuid);
//       String msg="登录成功";
//        if (name == null || name.isEmpty()){
//            msg="登录失败";
//       }else{
//            rabbitTemplate.convertAndSend("killExchange","killRouting",name);
//        }
//
//        return msg ;
//    }


}
