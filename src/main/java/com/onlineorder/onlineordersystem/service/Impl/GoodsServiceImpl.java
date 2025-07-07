package com.onlineorder.onlineordersystem.service.Impl;

import com.onlineorder.onlineordersystem.model.dao.GoodsMapper;
import com.onlineorder.onlineordersystem.model.pojo.Goods;
import com.onlineorder.onlineordersystem.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public ArrayList<Goods> getGoodsInfo() {
        return goodsMapper.getGoodsInfo();
    }

    @Override
    public boolean updateGoodsInfo(Goods goods) {
        return goodsMapper.updateGoodsInfo(goods);
    }

    @Override
    public boolean deleteGoods(int dish_id) {
        return goodsMapper.deleteGoods(dish_id);
    }
}
