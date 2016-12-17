package com.bbgkh.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Repository
public interface BaseDAO {
    public int insert(Object entity);

    public List selectById(String  uid);

    public List selectAll();
}
