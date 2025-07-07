package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.User;
import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> userRegister(@RequestBody User user) {
        try {
            if (userService.userRegister(user)) {
                return ResponseEntity.status(HttpStatus.CREATED).body("注册成功");
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("用户名已存在");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("注册失败: " + e.getMessage());
        }
    }

    @GetMapping("/userInfo")
    public ResponseEntity<User> userInfo(@RequestParam String username) {
        try {
            User userInfo = userService.getUserInfo(username);
            if (userInfo == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
            return ResponseEntity.ok(userInfo);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/updateUserInfo")
    public boolean updateUserInfo(@RequestBody User user) {
        try {
            return userService.updateUserInfo(user);
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
