package com.bbgkh.model.BO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang on 24/04/2017.
 */
public class SaleInfoBO extends BaseModel {
    private Integer id;
    private String productSysNo;
    private double salePrice;
    private int saleNum;
    private int sex;
    private String color;
    private String size;
    private String mobilePhone;

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductSysNo() {
        return productSysNo;
    }

    public void setProductSysNo(String productSysNo) {
        this.productSysNo = productSysNo;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
