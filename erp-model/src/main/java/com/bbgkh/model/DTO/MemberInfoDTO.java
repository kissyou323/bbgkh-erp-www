package com.bbgkh.model.DTO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang01 on 2/6/2017.
 */
public class MemberInfoDTO extends BaseModel{

    //会员的姓名
    private String name;

    //会员属于哪一个店子
    private String customerUid;

    //会员卡号
    private String cardId;

    //会员的手机号
    private String mobilePhone;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCustomerUid() {
        return customerUid;
    }

    public void setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

}
