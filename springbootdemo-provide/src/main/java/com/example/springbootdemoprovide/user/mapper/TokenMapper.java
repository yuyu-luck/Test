package com.example.springbootdemoprovide.user.mapper;

import com.example.springbootdemoprovide.user.model.Token;

public interface TokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Token record);

    int insertSelective(Token record);

    String searchToken(String tokenuuid);

    String getInfo();

    int updateByPrimaryKeySelective(Token record);

    int updateByPrimaryKey(Token record);
}