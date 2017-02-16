package com.bbgkh.service.impl;

import com.bbgkh.dao.IReportDao;
import com.bbgkh.model.BaseInfo;
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
    public BaseInfo selectById(String uid) {
        return null;
    }

    @Override
    public int update(Object entity) {
        return 0;
    }

    @Override
    public BaseInfo selectByDay(String uid, String timeStamp) {
        BaseInfo baseInfo = new BaseInfo("0");
        List reportInfos = reportDao.selectByDay(uid,timeStamp);
        baseInfo.setObject(reportInfos);
        return baseInfo;
    }
}
