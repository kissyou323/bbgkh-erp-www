package com.love.model.DTO;

/**
 * Created by lixiang on 2016/7/19.
 */
public class ProjectsDTO {

    private String id ;
    private int total;
    private String remark;
    private String oper;
    private float distribute;

    public float getDistribute() {
        return distribute;
    }

    public void setDistribute(float distribute) {
        this.distribute = distribute;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }
}
