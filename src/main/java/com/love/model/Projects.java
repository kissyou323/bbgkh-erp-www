package com.love.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.sql.Date;


/**
 * Created by lixiang on 2016/7/18.
 */
public class Projects {
    private int id ;
    private int total;
    private int already;
    private String remark;

    @JSONField(format="yyyy-MM-dd")
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAlready() {
        return already;
    }

    public void setAlready(int already) {
        this.already = already;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
