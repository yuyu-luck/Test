package com.example.springbootdemoprovide.user.controller;

import com.example.springbootdemoprovide.dictionary.CommonData;
import com.example.springbootdemoprovide.user.model.Token;
import com.example.springbootdemoprovide.user.model.User;
import com.example.springbootdemoprovide.user.service.TokenService;
import com.example.springbootdemoprovide.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
//    private RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    private User user;

    private Token token;

//    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
//    public User get1(@PathVariable Integer id) {return user;}
//    @RequestMapping("login")
//    public String login(@RequestBody User user,HttpSession httpSession,HttpServletResponse response) {
//
//        user= userService.selectByPrimaryKey(user);
//        //服务器存储一份d
//        httpSession.setAttribute("user",user);
//        //存tooken进数据库
//        String tokenUUID= UUID.randomUUID().toString();
//        token.setInfo(user.getName());
//        token.setTokenuuid(tokenUUID);
//        tokenService.insert(token);
//        //客户端存储一份
//        Cookie cookie=new Cookie("token",tokenUUID);
//        //设置到期时间为一个月,默认-1关闭浏览器即消失
//        cookie.setMaxAge(60*60*24*30);
//        //实现两个系统之间进行cookie共享，就必须设置下面两个值
//        cookie.setPath("/");
//        //cookie的跨域共享实现
////        cookie.setDomain("71360.com");
//        response.addCookie(cookie);
//        return "user/list";
//    }

//    @RequestMapping("loginout")
//    public String loginout(HttpServletResponse response) {
//        Cookie cookie = new Cookie(CommonData.TC_TOKEN, null);
//        cookie.setPath("/");
//        cookie.setMaxAge(0);
//        cookie.setDomain("71360.com");
//        response.addCookie(cookie);
//        tokenManager.removeToken();
//        return "/user/login";
////    }



//    @RequestMapping("list")
//    public List<User> list() {
//        List<User> list=userService.list();
//        for (User u:list) {
//            redisTemplate.opsForValue().set(new Date(), u);
//        }
//        return list;
//    }

    @RequestMapping("list")
    public List<User> list() {
        List<User> list=userService.list();
        return list;
    }

//    @RequestMapping("login")
//    public String login(@RequestParam("tokenuuid")String tokenuuid){
//        String name=tokenService.searchToken(tokenuuid);
//        return name;
//    }


}
