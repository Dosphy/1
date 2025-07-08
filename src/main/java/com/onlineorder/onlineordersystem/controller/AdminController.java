package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.*;
import com.onlineorder.onlineordersystem.service.AdminService;
import com.onlineorder.onlineordersystem.service.GoodsService;
import com.onlineorder.onlineordersystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/getStock")
    public Result getStock(){
        List<Stock> stock = adminService.getStock();
        if (stock != null) {
            return new Result(Code.GET_STOCK_SUCCESS,"获取库存信息成功!",stock);
        } else {
            return new Result(Code.GET_STOCK_FAIL,"获取库存信息失败!",stock);
        }
    }

    @PostMapping("/addStock")
    public Result addStock(@RequestParam String materialName,@RequestParam int number){
        Map<String, Object> stock = new HashMap<>();
        stock.put("materialName", materialName);
        stock.put("number", number);
        boolean flag = adminService.addStock(stock);
        if (flag) {
            return new Result(Code.ADD_STOCK_SUCCESS,"增加库存成功!",flag);
        } else {
            return new Result(Code.ADD_STOCK_FAIL,"增加库存失败!",flag);
        }
    }

    @GetMapping("/getUserOrders")
    public Result getUserOrders(){
        ArrayList<Order> orders = adminService.getUserOrders();
        if (orders != null) {
            return new Result(Code.GET_USERORDERS_SUCCESS,"获取用户待处理订单信息成功!",orders);
        } else {
            return new Result(Code.GET_USERORDERS_NOTHING,"暂无待处理用户订单信息!",orders);
        }
    }

    @PostMapping("/dealUserOrder")
    public Result dealUserOrder(@RequestParam int order_id){
        boolean flag = adminService.dealUserOrder(order_id);
        if (flag) {
            return new Result(Code.DEAL_USERORDERS_SUCCESS,"处理用户订单成功!",flag);
        } else {
            return new Result(Code.DEAL_USERORDERS_FAIL,"处理用户订单失败!",flag);
        }
    }
}
