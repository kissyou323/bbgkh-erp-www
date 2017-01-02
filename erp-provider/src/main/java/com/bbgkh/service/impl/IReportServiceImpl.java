package com.bbgkh.service.impl;

import com.bbgkh.dao.IReportDao;
import com.bbgkh.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 12/17/2016.
 */
@Service
public class IReportServiceImpl implements IReportService {
    @Autowired
    private IReportDao reportDao;
    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public List selectById(String uid) {
        return reportDao.selectById(uid);
    }

    @Override
    public int update(Object entity) {
        return 0;
    }

    @Override
    public List selectByDay(String uid,String timeStamp) {
        return reportDao.selectByDay(uid,timeStamp);
    }
}
