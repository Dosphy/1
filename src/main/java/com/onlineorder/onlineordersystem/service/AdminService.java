package com.onlineorder.onlineordersystem.service;

import com.onlineorder.onlineordersystem.model.pojo.Stock;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AdminService {
    boolean login(String username, String password);

    boolean addStock(Map<String, Object> stock);

    List<Stock> getStock();
}
