package com.bbgkh.service.impl;


import com.bbgkh.dao.IHomeDao;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 13/12/2016.
 */
@Service
public class IHomeServiceImpl implements IHomeService {

    @Autowired
    private IHomeDao homeDao;

    @Override
    public BaseInfo insert(Object entity) {
        return null;
    }

    @Override
    public List selectAll() {

        List<SaleInfoPO> soList =homeDao.selectAll();

        return soList;

    }

    @Override
    public BaseInfo selectById(String id) {
        return null;
    }

    @Override
    public BaseInfo update(Object entity) {
        return null;
    }
}
