package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.Goods;
import com.onlineorder.onlineordersystem.model.pojo.User;
import com.onlineorder.onlineordersystem.service.AdminService;
import com.onlineorder.onlineordersystem.service.GoodsService;
import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adminControl")
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    UserService userService;
    @Autowired
    GoodsService goodsService;

    @GetMapping("/adminLogin")
    public boolean adminLogin(
            @RequestParam String username,
            @RequestParam String password) {
        try {
            return adminService.login(username,password);
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @GetMapping("/getAllUserInfo")
    public ResponseEntity<List<User>> getAllUserInfo() {
        try {
            return (ResponseEntity<List<User>>) userService.getAllUserInfo();
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/updateGoodsInfo")
    public boolean updateGoodsInfo(@RequestBody Goods goods){
        try {
            return goodsService.updateGoodsInfo(goods);
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @DeleteMapping("/deleteGoods")
    public boolean deleteGoods(@RequestParam int id){
        try {
            return goodsService.deleteGoods(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
