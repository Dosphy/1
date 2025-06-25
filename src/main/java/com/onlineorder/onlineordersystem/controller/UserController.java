package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public void userLogin(String username,String password){
        if(userService.userLogin(username,password)){
            System.out.println("登录成功,"+username+",欢迎点餐！");
        }
    }

    public void userRegister(String username,String password){
        if(userService.userRegister(username,password)){
            System.out.println("注册成功");
        }
    }
}
