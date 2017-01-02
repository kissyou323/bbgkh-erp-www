package com.bbgkh.model.DTO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang on 12/19/2016.
 */
public class ProductInfoDTO extends BaseModel{

    private String productSysNo;

    private String sexId;


    private String colorInfoId;

    private String sizeInfoId;

    private String inventory;

    private String buyPrice;


    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getColorInfoId() {
        return colorInfoId;
    }

    public void setColorInfoId(String colorInfoId) {
        this.colorInfoId = colorInfoId;
    }

    public String getSizeInfoId() {
        return sizeInfoId;
    }

    public void setSizeInfoId(String sizeInfoId) {
        this.sizeInfoId = sizeInfoId;
    }

    public String getProductSysNo() {
        return productSysNo;
    }

    public void setProductSysNo(String productSysNo) {
        this.productSysNo = productSysNo;
    }

    public String getSexId() {
        return sexId;
    }

    public void setSexId(String sexId) {
        this.sexId = sexId;
    }
}
