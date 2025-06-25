package com.onlineorder.onlineordersystem;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.onlineorder.onlineordersystem.model.dao"})
class OnlineOrderSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineOrderSystemApplication.class, args);

    }
}
