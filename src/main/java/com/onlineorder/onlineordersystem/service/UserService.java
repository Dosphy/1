package com.onlineorder.onlineordersystem.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public boolean userLogin(String username,String password);

    public boolean userRegister(String username,String password);
}
