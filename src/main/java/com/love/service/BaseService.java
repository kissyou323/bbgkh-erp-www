package com.love.service;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
public   interface BaseService<T> {
    public  void insert( T entity);
    public  List selectAll();
    public  List selectByMem(int id);
}
