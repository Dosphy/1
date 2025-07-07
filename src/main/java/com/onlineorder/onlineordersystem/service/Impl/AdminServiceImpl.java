package com.onlineorder.onlineordersystem.service.Impl;

import com.onlineorder.onlineordersystem.model.dao.AdminMapper;
import com.onlineorder.onlineordersystem.model.pojo.Admin;
import com.onlineorder.onlineordersystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public boolean login(String username, String password) {
        String pwd = adminMapper.login(username).getAdminpwd();
        if(pwd.equals(password)){
            return true;
        }else {
            return false;
        }

    }
}
