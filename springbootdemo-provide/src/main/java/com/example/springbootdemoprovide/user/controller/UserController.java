package com.example.springbootdemoprovide.user.controller;

import com.example.springbootdemoprovide.dictionary.CommonData;
import com.example.springbootdemoprovide.user.model.Token;
import com.example.springbootdemoprovide.user.model.User;
import com.example.springbootdemoprovide.user.scheduling.DynamicScheduleTask;
import com.example.springbootdemoprovide.user.service.TokenService;
import com.example.springbootdemoprovide.user.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
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
@Api(tags = "用户登录与注册")
public class UserController {

//    @Autowired
//    private RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private DynamicScheduleTask dynamicScheduleTask;

    @Autowired
    private ScheduledTaskRegistrar taskRegistrar;

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
    @ApiOperation(value = "测试@PathVariable注解的第一种使用情况", notes = "<span style='color:red;'>描述:</span>&nbsp;用来测试@PathVariable注解的第一种使用情况")
    public PageInfo<User> list(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize) {
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        //1.先从redis中获取数据
//        Object o = valueOperations.get("user::findById::" + id);
//        //2.如果存在  则直接返回
//        if(o!=null){
//            return (List<User>) o;
//        }
        //3.如果不存在则查询数据库  并把查询的结果放入redis中
//        if(user!=null){
//            valueOperations.set("user::findById::"+id,user,30, TimeUnit.MINUTES); //缓存的过期时间
//        }
        PageInfo<User> pageInfo =userService.list(pageNum,pageSize);
        return pageInfo;
    }

    @RequestMapping("register")
    @ApiOperation(value = "测试@PathVariable注解的第一种使用情况", notes = "<span style='color:red;'>描述:</span>&nbsp;用来测试@PathVariable注解的第一种使用情况")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "用户姓名",dataType = "String"),
            @ApiImplicitParam(name = "passward",value = "用户密码",dataType = "String")
    })
    public String register(@RequestParam("name")String name,@RequestParam("passward")String passward) {
        boolean i=userService.register(name,passward);
        String msg="注册成功";
        if(!i){
            msg="注册失败";
        }
        return msg;
    }
//    @RequestMapping("login")
//    public String login(@RequestParam("tokenuuid")String tokenuuid){
//        String name=tokenService.searchToken(tokenuuid);
//        return name;
//    }

    @RequestMapping("task")
    @ApiOperation(value = "测试@PathVariable注解的第一种使用情况", notes = "<span style='color:red;'>描述:</span>&nbsp;用来测试@PathVariable注解的第一种使用情况")
    public String login(){
        dynamicScheduleTask.configureTasks(taskRegistrar);
        return "";
    }
}
