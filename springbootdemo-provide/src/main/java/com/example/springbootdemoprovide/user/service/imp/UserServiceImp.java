package com.example.springbootdemoprovide.user.service.imp;

import com.example.springbootdemoprovide.user.mapper.UserMapper;
import com.example.springbootdemoprovide.user.model.User;
import com.example.springbootdemoprovide.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
    // 将数据缓存到redis中在方法加上此注解，value是在Redis存储时key的值
    @Cacheable(value = "listCategoryForCustomer")
    public PageInfo list(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList=userMapper.list();
        PageInfo<User> pageInfo=new PageInfo<>(userList);
        return pageInfo;
    }

    @Override
    public boolean register(@NonNull String name, @NonNull String passward) {
     Integer count= userMapper.register(name,passward);
        return (Objects.isNull(count)?0:count)>0;
    }


}
