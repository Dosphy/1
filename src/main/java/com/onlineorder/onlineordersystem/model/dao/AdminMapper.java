package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.Admin;
import com.onlineorder.onlineordersystem.model.pojo.Order;
import com.onlineorder.onlineordersystem.model.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
public interface AdminMapper {
    Admin login(String username);

    boolean addStock(Map<String, Object> stock);


    List<Stock> getStock();

    ArrayList<Order> getUserOrders();

    boolean dealUserOrder(int order_id);
}
