package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface GoodsMapper {
    ArrayList<Goods> getGoodsInfo();

    boolean updateGoodsInfo(Goods goods);

    boolean deleteGoods(int dish_id);
}
