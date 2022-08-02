package com.example.springbootdemoprovide.user.service;

import com.example.springbootdemoprovide.user.model.SysUser;
import org.springframework.stereotype.Service;


public interface SysUserService {
    /**
     * 根据用户民查询信息
     * @param name 用户名
     * @return
     */
    SysUser findByName(String name) throws Exception;
}
