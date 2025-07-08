package com.onlineorder.onlineordersystem.model.pojo;

public class Stock {
    int material_id;
    String material;
    String mat_cat;
    int mat_num;
    int mat_minnum;

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMat_cat() {
        return mat_cat;
    }

    public void setMat_cat(String mat_cat) {
        this.mat_cat = mat_cat;
    }

    public int getMat_num() {
        return mat_num;
    }

    public void setMat_num(int mat_num) {
        this.mat_num = mat_num;
    }

    public int getMat_minnum() {
        return mat_minnum;
    }

    public void setMat_minnum(int mat_minnum) {
        this.mat_minnum = mat_minnum;
    }
}
