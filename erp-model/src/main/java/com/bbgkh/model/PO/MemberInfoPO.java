package com.bbgkh.model.PO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang01 on 2/7/2017.
 */
public class MemberInfoPO extends BaseModel {

    //会员的id
    private Integer id;

    //会员的姓名
    private String memberName;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
