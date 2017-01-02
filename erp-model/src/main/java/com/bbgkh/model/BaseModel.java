package com.bbgkh.model;

/**
 * Created by lixiang on 11/12/2016.
 */
public class BaseModel {
    //统一添加UID，为了区分用户,可能生成的UID太长
    //使用String类型
    private String uid;

    //UID，为公司编号，pid是个人编号
    //为以后权限控制方便
    private String pid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
