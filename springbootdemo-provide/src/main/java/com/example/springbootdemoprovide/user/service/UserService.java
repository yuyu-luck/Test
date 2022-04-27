package com.example.springbootdemoprovide.user.service;

import com.example.springbootdemoprovide.user.model.User;
import com.github.pagehelper.PageInfo;
import org.springframework.lang.NonNull;



public interface UserService {

    User selectByPrimaryKey(User user);

    /**
     * pagehelper分页插件实现分页
     * @param pageNum 页数
     * @param pageSize 每页显示条数
     * @return
     */
    PageInfo<User> list(int pageNum,int pageSize);

    boolean register(@NonNull String name, @NonNull String passward);


}
