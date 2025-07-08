package com.onlineorder.onlineordersystem.service.Impl;

import com.onlineorder.onlineordersystem.model.dao.AdminMapper;
import com.onlineorder.onlineordersystem.model.pojo.Order;
import com.onlineorder.onlineordersystem.model.pojo.Stock;
import com.onlineorder.onlineordersystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public boolean login(String username, String password) {
        String pwd = adminMapper.login(username).getAdminpwd();
        if(pwd.equals(password)){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean addStock(Map<String, Object> stock) {
        return adminMapper.addStock(stock);
    }

    @Override
    public List<Stock> getStock() {
        return adminMapper.getStock();
    }

    @Override
    public ArrayList<Order> getUserOrders() {
        return adminMapper.getUserOrders();
    }

    @Override
    public boolean dealUserOrder(int order_id) {
        return adminMapper.dealUserOrder(order_id);
    }
}
