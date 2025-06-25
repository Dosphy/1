package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
    Goods getGoods(int id);


}
