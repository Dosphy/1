package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.Admin;

public interface AdminMapper {
    Admin login(String username);
}
