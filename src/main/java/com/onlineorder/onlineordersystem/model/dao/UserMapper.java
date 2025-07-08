package com.onlineorder.onlineordersystem.model.dao;

import com.onlineorder.onlineordersystem.model.pojo.HistoryOrder;
import com.onlineorder.onlineordersystem.model.pojo.Order;
import com.onlineorder.onlineordersystem.model.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper {
    User getUserByUsername(String username);

    void insertUser(User user);

    boolean updateUserInfo(User user);

    List<User> getAllUserInfo();

    ArrayList<HistoryOrder> getHistoryOrder(String username);

    boolean deleteUser(String username);

    boolean sendOrder(Order order);

    boolean reduceStock(int number);
}
