package com.bbgkh.model.PO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang01 on 2/7/2017.
 */
public class MemberInfoPO extends BaseModel {

    //会员的id
    private Integer id;

    //会员的姓名
    private String name;

    //会员属于哪一个店子
    private String customerUid;

    //会员的手机号
    private String mobilePhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerUid() {
        return customerUid;
    }

    public void setCustomerUid(String customerUid) {
        this.customerUid = customerUid;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
