package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.Code;
import com.onlineorder.onlineordersystem.model.pojo.Goods;
import com.onlineorder.onlineordersystem.model.pojo.Result;
import com.onlineorder.onlineordersystem.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping("/goodsControl")
public class GoodsController {
    @Autowired
    GoodsService goodsService;

    @GetMapping("/getGoodsInfo")
    public Result getGoodsInfo(){
        ArrayList<Goods> goods = goodsService.getGoodsInfo();
        for(Goods good : goods){
            System.out.println(good.getDescription());
        }
        if(goods != null){
            return new Result(Code.DISH_GET_SUCCESS,"获取所有菜品信息成功!",goods);
        } else {
            return new Result(Code.DISH_GET_FAIL,"获取所有菜品信息失败",goods);
        }
    }

    @PostMapping("/addDishes")
    public Result addDishes(@RequestBody Goods goods){
        boolean flag = goodsService.addDishes(goods);
        if (flag) {
            return new Result(Code.ADD_DISHES_SUCCESS,"添加菜品信息成功!",flag);
        } else {
            return new Result(Code.ADD_DISHES_FAIL,"添加菜品信息失败!",flag);
        }
    }
}
