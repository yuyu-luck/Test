package com.example.springbootdemoprovide.user.mapper;

import com.example.springbootdemoprovide.user.model.SyserPermission;

public interface SyserPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SyserPermission record);

    int insertSelective(SyserPermission record);

    SyserPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SyserPermission record);

    int updateByPrimaryKey(SyserPermission record);
}