package com.example.springbootdemoprovide.user.mapper;

import com.example.springbootdemoprovide.user.model.UserIndex;

public interface UserIndexMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserIndex record);

    int insertSelective(UserIndex record);

    UserIndex selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserIndex record);

    int updateByPrimaryKeyWithBLOBs(UserIndex record);

    int updateByPrimaryKey(UserIndex record);
}