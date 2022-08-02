package com.example.springbootdemoprovide.user.service.imp;

import com.example.springbootdemoprovide.user.mapper.SysUserMapper;
import com.example.springbootdemoprovide.user.model.SysUser;
import com.example.springbootdemoprovide.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByName(String name) throws Exception {
        return sysUserMapper.findByName(name);
    }
}
