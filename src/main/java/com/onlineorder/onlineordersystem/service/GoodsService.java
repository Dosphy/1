package com.onlineorder.onlineordersystem.service;

import com.onlineorder.onlineordersystem.model.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface GoodsService {
    ArrayList<Goods> getGoodsInfo();

    boolean updateGoodsInfo(Goods goods);

    boolean deleteGoods(int id);
}
