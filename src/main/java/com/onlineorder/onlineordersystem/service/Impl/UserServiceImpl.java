package com.onlineorder.onlineordersystem.service.Impl;

import com.onlineorder.onlineordersystem.model.dao.UserMapper;
import com.onlineorder.onlineordersystem.model.pojo.User;
import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean userLogin(String username, String password) {
        User user = userMapper.getUserByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean userRegister(User user) {
        userMapper.insertUser(user);
        return true;
    }

    @Override
    public User getUserInfo(String username) {
        User user = userMapper.getUserByUsername(username);
        if(user != null){
            return user;
        }else {
            return null;
        }
    }

    @Override
    public boolean updateUserInfo(User user) {
        return userMapper.updateUserInfo(user);
    }
}
