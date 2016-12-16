package com.bbgkh.service.impl;


import com.bbgkh.dao.IUserDao;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 12/16/2016.
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public List selectById(int uid) {
        return userDao.selectById(uid);
    }

    @Override
    public List<CustomerPO> validateUser(String uid) {
        return userDao.validateUser(uid);
    }
}
