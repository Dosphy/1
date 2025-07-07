package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.Code;
import com.onlineorder.onlineordersystem.model.pojo.Result;
import com.onlineorder.onlineordersystem.model.pojo.User;
import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userControl")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/userLogin")
    public Result userLogin(
            @RequestParam String username,
            @RequestParam String password) {
        boolean flag = userService.userLogin(username, password);
        if (flag) {
            return new Result(Code.USER_LOGIN_SUCCESS,"登录成功!",flag);
        } else {
            return new Result(Code.USER_LOGIN_FAIL,"用户名或密码错误!",flag);
        }
    }

    @PostMapping("/userRegister")
    public Result userRegister(@RequestBody User user) {
        boolean flag = userService.userRegister(user);
        if (flag) {
            return new Result(Code.USER_REGISTER_SUCCESS,"注册成功!",flag);
        } else {
            return new Result(Code.USER_EXIST,"用户名已存在!",flag);
        }
    }

    @GetMapping("/userInfo")
    public Result userInfo(@RequestParam String username) {
        User user = userService.getUserInfo(username);
        if(user != null) {
            return new Result(Code.GET_ONE_USERINFO_SUCCESS,"获取信息成功!",user);
        } else {
            return new Result(Code.GET_ONE_USERINFO_FAIL,"获取信息失败!",null);
        }
    }

    @PutMapping("/updateUserInfo")
    public Result updateUserInfo(@RequestBody User user) {
        boolean flag = userService.updateUserInfo(user);
        if (flag) {
            return new Result(Code.USER_UPDATE_SUCCESS,"修改成功!",flag);
        } else {
            return new Result(Code.USER_UPDATE_FAIL,"修改失败!",flag);
        }
    }
}
