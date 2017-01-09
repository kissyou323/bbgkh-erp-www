package com.bbgkh.dao.impl;

import com.bbgkh.dao.IUserDao;
import com.bbgkh.model.PO.CustomerPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

/**
 * Created by lixiang on 17/12/2016.
 */
public class IUserDaoImpl implements IUserDao {
    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public List selectById(String uid) {
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

    @Override
    public List<CustomerPO> validateUser(@Param("uid") String uid, @Param("password") String password) {
        return null;
    }

    @Override
    public CustomerPO findUserByUsername(String username) {
        return null;
    }

    @Override
    public Set<String> findRoles(String username) {
        return null;
    }

    @Override
    public Set<String> findPermissions(String username) {
        return null;
    }
}
