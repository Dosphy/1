package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userControl")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/userLogin")
    public ResponseEntity<String> userLogin(
            @RequestParam String username,
            @RequestParam String password) {
        try {
            if (userService.userLogin(username, password)) {
                return ResponseEntity.ok("登录成功," + username + ",欢迎点餐！");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("用户名或密码错误");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("登录失败: " + e.getMessage());
        }
    }
    @GetMapping("/userRegister")
    public ResponseEntity<String> userRegister(
            @RequestParam String username,
            @RequestParam String password) {
        try {
            if (userService.userRegister(username, password)) {
                return ResponseEntity.status(HttpStatus.CREATED).body("注册成功");
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("用户名已存在");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("注册失败: " + e.getMessage());
        }
    }
}
