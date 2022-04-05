package com.example.springbootdemoconsumer.fegin;



import com.example.springbootdemoprovide.user.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient(name="springbootdemo-provide",url = "http://192.168.1.4:7002/user")
public interface UserFegin {

//    @RequestMapping("/get")
////    User get(@RequestParam("id") Integer id);

    @RequestMapping("/login")
    String login(@RequestParam("tokenuuid")String tokenuuid);
}
