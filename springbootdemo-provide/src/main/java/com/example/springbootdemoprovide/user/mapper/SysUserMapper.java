package com.example.springbootdemoprovide.user.mapper;

import com.example.springbootdemoprovide.user.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);
    /**
     * 根据用户民查询信息
     * @param name 用户名
     * @return
     */
    SysUser findByName(String name) throws Exception;


    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
