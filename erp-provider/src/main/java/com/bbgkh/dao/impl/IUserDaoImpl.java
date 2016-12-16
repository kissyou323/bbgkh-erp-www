package com.bbgkh.dao.impl;

import com.bbgkh.dao.IUserDao;
import com.bbgkh.model.PO.CustomerPO;

import java.util.List;

/**
 * Created by lixiang on 12/16/2016.
 */
public class IUserDaoImpl implements IUserDao {
    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public List selectById(int id) {
        return null;
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public List<CustomerPO> validateUser(String uid) {
        return null;
    }
}
