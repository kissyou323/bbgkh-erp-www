package com.bbgkh.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by lixiang on 2016/7/18.
 */
public class Detail {
    private int id;
    private int projectId;
    private String projectName;
    private int inorout;
    private int amount;
    private String remark;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date time;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
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
