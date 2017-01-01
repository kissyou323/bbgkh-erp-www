package com.bbgkh.model.DTO;

/**
 * Created by lixiang on 12/19/2016.
 */
public class ProductInfoDTO {

    private String productSysNo;

    private String sexId;


    private String colorInfoId;

    private String sizeInfoId;


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
