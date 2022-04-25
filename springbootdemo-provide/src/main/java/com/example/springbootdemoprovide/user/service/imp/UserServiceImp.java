package com.example.springbootdemoprovide.user.service.imp;

import com.example.springbootdemoprovide.user.mapper.UserMapper;
import com.example.springbootdemoprovide.user.model.User;
import com.example.springbootdemoprovide.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User selectByPrimaryKey(User user) {
        return userMapper.selectByPrimaryKey(user);
    }

    @Override
    public List list() {
        return userMapper.list();
    }

    @Override
    public boolean register(@NonNull String name, @NonNull String passward) {
     Integer count= userMapper.register(name,passward);
        return (Objects.isNull(count)?0:count)>0;
    }

    public static void main(String[] args) {
        UserServiceImp userServiceImp=new UserServiceImp();
        userServiceImp.register("hh","1209");
    }
}
