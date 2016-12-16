package com.bbgkh.model;

/**
 * Created by lixiang on 11/12/2016.
 */
public class BaseModel {
    //统一添加UID，为了区分用户,可能生成的UID太长
    //使用String类型
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
