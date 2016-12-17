package com.bbgkh.model.PO;

import com.bbgkh.model.BaseModel;

import java.io.Serializable;

/**
 * Created by lixiang on 12/16/2016.
 */
public class CustomerPO extends BaseModel implements Serializable{

    private static final long serialVersionUID = 7952011612529341638L;
    private Integer id;
    private String name;
    private String password;
    private Integer mobilePhone;
    private String email;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Integer mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
