package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    Admin login(String username);
}
