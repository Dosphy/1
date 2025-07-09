package com.onlineorder.onlineordersystem.model.pojo;

import lombok.Data;

@Data
public class OrderRequest {
    private Integer order_id;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
}