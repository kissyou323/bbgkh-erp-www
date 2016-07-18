package com.love.model;

import java.util.Date;

/**
 * Created by lixiang on 2016/7/18.
 */
public class Detail {
    private int id;
    private int projectid;
    private int inorout;
    private int amount;
    private String remark;
    private Date time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    public int getInorout() {
        return inorout;
    }

    public void setInorout(int inorout) {
        this.inorout = inorout;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
