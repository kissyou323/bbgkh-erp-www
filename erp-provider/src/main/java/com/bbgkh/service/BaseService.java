package com.bbgkh.service;

import com.bbgkh.model.BaseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Repository
public   interface BaseService {
    public  BaseInfo insert(Object entity);
    public  List selectAll();
    public  BaseInfo selectById(String uid);
    public  BaseInfo update(Object entity);

}
