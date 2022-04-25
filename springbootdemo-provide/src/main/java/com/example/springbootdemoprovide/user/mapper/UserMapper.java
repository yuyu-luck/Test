package com.example.springbootdemoprovide.user.mapper;

import com.example.springbootdemoprovide.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    Integer deleteByPrimaryKey(Integer id);

    Integer register(@Param("name") String name, @Param("passward") String passward);

    Integer insertSelective(User record);

    User selectByPrimaryKey(User user);

    List<User> list();

    Integer updateByPrimaryKeySelective(User record);

    Integer updateByPrimaryKey(User record);
}