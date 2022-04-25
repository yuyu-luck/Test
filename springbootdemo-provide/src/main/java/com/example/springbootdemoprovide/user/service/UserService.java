package com.example.springbootdemoprovide.user.service;

import com.example.springbootdemoprovide.user.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService {

    User selectByPrimaryKey(User user);

    List<User> list();

    boolean register(@NonNull String name, @NonNull String passward);


}
