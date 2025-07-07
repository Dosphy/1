package com.onlineorder.onlineordersystem.service;

import com.onlineorder.onlineordersystem.model.pojo.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    boolean userLogin(String username,String password);

    boolean userRegister(User user);

    User getUserInfo(String username);

    boolean updateUserInfo(User user);

    List<User> getAllUserInfo();
}
