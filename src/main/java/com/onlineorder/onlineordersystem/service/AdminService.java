package com.onlineorder.onlineordersystem.service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    boolean login(String username, String password);
}
