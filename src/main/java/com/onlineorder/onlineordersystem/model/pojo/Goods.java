package com.onlineorder.onlineordersystem.model.pojo;

public class Goods {
    int dish_id;
    String dish_name;
    String path;
    double price;
    int mon_sale;
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDish_id() {
        return dish_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getMon_sale() {
        return mon_sale;
    }

    public void setMon_sale(int mon_sale) {
        this.mon_sale = mon_sale;
    }

    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }
}
