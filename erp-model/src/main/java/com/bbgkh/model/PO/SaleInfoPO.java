package com.bbgkh.model.PO;

/**
 * Created by lixiang on 14/12/2016.
 */
public class SaleInfoPO {
    private Integer id;
    private String productSysNo;
    private double salePrice;
    private String saleTime;
    private Integer saleNum;
    private Integer sex;
    private String color;
    private String size;

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

    public String getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(String saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
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
