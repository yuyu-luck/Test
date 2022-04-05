package com.example.springbootdemoprovide.user.service;

import com.example.springbootdemoprovide.user.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService {

    User selectByPrimaryKey(User user);

    List<User> list();


}
