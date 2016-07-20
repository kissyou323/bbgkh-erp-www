package com.love.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Repository
public interface BaseDAO<T> {
    public void insert( T entity);

    public List selectById(int id);

    public List selectAll();
}
