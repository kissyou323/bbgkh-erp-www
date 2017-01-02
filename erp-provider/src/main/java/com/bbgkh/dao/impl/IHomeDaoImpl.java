package com.bbgkh.dao.impl;

import com.bbgkh.dao.IHomeDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 13/12/2016.
 */

public class IHomeDaoImpl implements IHomeDao {
    @Override
    public int insert(Object entity) {
        return 1;
    }

    @Override
    public List selectById(String id) {
        return null;
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public int update(Object entity) {
        return 0;
    }
}
