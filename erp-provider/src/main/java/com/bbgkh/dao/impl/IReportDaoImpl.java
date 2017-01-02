package com.bbgkh.dao.impl;

import com.bbgkh.dao.IReportDao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixiang on 12/17/2016.
 */
public class IReportDaoImpl implements IReportDao {
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
    public List selectByDay(@Param("uid") String uid, @Param("timeStamp")  String timeStamp) {
        return null;
    }
}
