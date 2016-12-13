package com.bbgkh.service;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Repository
public   interface BaseService {
    public  void insert(Object entity);
    public  List selectAll();
    public  List selectById(int id);
}
