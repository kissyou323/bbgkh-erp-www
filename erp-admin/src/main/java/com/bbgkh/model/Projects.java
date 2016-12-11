package com.bbgkh.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.sql.Date;


/**
 * Created by lixiang on 2016/7/18.
 */
public class Projects implements Serializable{
    private static final long serialVersionUID = 1435360478166529410L;
    private int id ;
    private int memId;
    private int total;
    private int already;
    private String remark;
    private float distribute;

    public float getDistribute() {
        return distribute;
    }

    public void setDistribute(float distribute) {
        this.distribute = distribute;
    }

    @JSONField(format="yyyy-MM-dd")
    private Date createTime;

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

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
