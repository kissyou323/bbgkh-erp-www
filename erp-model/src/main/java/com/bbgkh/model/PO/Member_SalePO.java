package com.bbgkh.model.PO;

import com.bbgkh.model.BaseModel;

/**
 * Created by lixiang on 26/04/2017.
 */
public class Member_SalePO extends BaseModel {

    private Integer id;
    private Integer memId;
    private Integer saleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }
}
