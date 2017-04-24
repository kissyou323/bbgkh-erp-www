package com.bbgkh.model.DTO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang01 on 2/6/2017.
 */
public class MemberInfoDTO extends BaseModel{

    private String cardId;
    private String mobilePhone;
    private String memberName;
    private String productSysNo;
    private String salePrice;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getProductSysNo() {
        return productSysNo;
    }

    public void setProductSysNo(String productSysNo) {
        this.productSysNo = productSysNo;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

}
