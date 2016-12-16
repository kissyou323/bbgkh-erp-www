package com.bbgkh.model.PO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang on 11/12/2016.
 */
public class ProductInfoPO extends BaseModel{
    private int id;
    private String productSysNo;
    private double buyPrice;
    private int invotory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductSysNo() {
        return productSysNo;
    }

    public void setProductSysNo(String productSysNo) {
        this.productSysNo = productSysNo;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getInvotory() {
        return invotory;
    }

    public void setInvotory(int invotory) {
        this.invotory = invotory;
    }
}
