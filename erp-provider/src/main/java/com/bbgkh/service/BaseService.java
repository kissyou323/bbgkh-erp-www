package com.bbgkh.service;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Repository
public   interface BaseService<T> {
    public  void insert(T entity);
    public  List selectAll();
    public  List selectById(int id);
}
