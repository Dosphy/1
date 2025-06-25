package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByUsername(String username);

    int insertUser(String username, String password);
}
