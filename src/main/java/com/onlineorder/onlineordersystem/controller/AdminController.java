package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.Code;
import com.onlineorder.onlineordersystem.model.pojo.Goods;
import com.onlineorder.onlineordersystem.model.pojo.Result;
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
    public Result adminLogin(
            @RequestParam String username,
            @RequestParam String password) {
        boolean flag = adminService.login(username, password);
        if (flag) {
            return new Result(Code.ADMIN_LOGIN_SUCCESS,"管理员登录成功!",flag);
        } else {
            return new Result(Code.ADMIN_LOGIN_FAIL,"管理员登录失败!",flag);
        }
    }

    @GetMapping("/getAllUserInfo")
    public Result getAllUserInfo() {
        List<User> list = userService.getAllUserInfo();
        if (list.size() > 0) {
            return new Result(Code.GET_ALL_USERINFO_SUCCESS,"获取所有用户信息成功!",list);
        } else {
            return new Result(Code.GET_ALL_USERINFO_FAIL,"获取所有用户信息失败!",list);
        }
    }

    @PostMapping("/updateGoodsInfo")
    public Result updateGoodsInfo(@RequestBody Goods goods){
        boolean flag = goodsService.updateGoodsInfo(goods);
        if (flag) {
            return new Result(Code.UPDATE_DISH_INFO_SUCCESS,"修改菜品信息成功!",flag);
        } else {
            return new Result(Code.UPDATE_DISH_INFO_FAIL,"修改菜品信息失败!",flag);
        }
    }

    @DeleteMapping("/deleteGoods")
    public Result deleteGoods(@RequestParam int dish_id){
        boolean flag = goodsService.deleteGoods(dish_id);
        if (flag) {
            return new Result(Code.DELETE_DISH_SUCCESS,"删除菜品成功!",flag);
        } else {
            return new Result(Code.DELETE_DISH_FAIL,"删除菜品失败!",flag);
        }
    }

    @DeleteMapping("/deleteUser")
    public Result deleteUser(@RequestParam String username){
        boolean flag = userService.deleteUser(username);
        if (flag) {
            return new Result(Code.USER_DELETE_SUCCESS,"删除用户成功!",flag);
        } else {
            return new Result(Code.USER_DELETE_FAIL,"删除用户失败!",flag);
        }
    }
}
