package com.bbgkh.model.VO.productVO;

/**
 * Created by lixiang on 11/12/2016.
 */
public class ProductInfoVO {
    private int id;
    private String productSysNo;
    private String buyPrice;
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

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getInvotory() {
        return invotory;
    }

    public void setInvotory(int invotory) {
        this.invotory = invotory;
    }
}
