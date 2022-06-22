package com.example.springbootdemoconsumer.controller;

import com.example.springbootdemoconsumer.fegin.UserFegin;
import com.example.springbootdemoprovide.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserFegin userFegin;

//    @RequestMapping("get")
//    public User get(@RequestParam("id") Integer id){
//        User user=userFegin.get(id);
//        return user;
//    }

    @RequestMapping("login")
    public String login(@RequestParam("tokenuuid") String tokenuuid) {
        String name = userFegin.login(tokenuuid);
        return name;
    }
    @RequestMapping("hello")
    public String hello() {
        String name = userFegin.hello();
        return name;
    }

    public static void main(String[] args) {

    }
}
