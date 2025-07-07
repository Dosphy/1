package com.onlineorder.onlineordersystem.controller;

import com.onlineorder.onlineordersystem.model.pojo.Goods;
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
    public ResponseEntity<ArrayList<Goods>> getGoodsInfo(){
        try{
            ArrayList<Goods> goods = goodsService.getGoodsInfo();
            return new ResponseEntity<>(goods, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
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
