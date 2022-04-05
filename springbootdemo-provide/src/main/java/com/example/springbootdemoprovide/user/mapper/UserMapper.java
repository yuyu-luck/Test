package com.example.springbootdemoprovide.user.mapper;

import com.example.springbootdemoprovide.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(User user);

    List<User> list();

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}