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
        if(goods != null){
            return new Result(Code.GET_ALL_USERINFO_SUCCESS,"获取所有用户信息成功!",goods);
        } else {
            return new Result(Code.GET_ALL_USERINFO_FAIL,"获取所有用户信息失败",goods);
        }
    }


}
