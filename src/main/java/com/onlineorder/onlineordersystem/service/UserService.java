package com.onlineorder.onlineordersystem.service;

import com.onlineorder.onlineordersystem.model.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean userLogin(String username,String password);

    boolean userRegister(User user);

    User getUserInfo(String username);

    boolean updateUserInfo(User user);
}
