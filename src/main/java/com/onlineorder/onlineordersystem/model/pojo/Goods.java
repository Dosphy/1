package com.onlineorder.onlineordersystem.model.pojo;

public class Goods {
    int dish_id;
    String dish_name;
    String dish_scale;
    String path;;
    double price;
    int mon_sale;
    String describe;

    public int getDish_id() {
        return dish_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public String getDish_scale() {
        return dish_scale;
    }

    public void setDish_scale(String dish_scale) {
        this.dish_scale = dish_scale;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setDish_id(int dish_id) {
        this.dish_id = dish_id;
    }
}
