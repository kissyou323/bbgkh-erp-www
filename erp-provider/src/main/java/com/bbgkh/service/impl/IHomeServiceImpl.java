package com.bbgkh.service.impl;


import com.bbgkh.dao.IHomeDao;
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
    public int insert(Object entity) {
        return 1;
    }

    @Override
    public List selectAll() {

        List<SaleInfoPO> soList =homeDao.selectAll();

        return soList;

    }

    @Override
    public List selectById(String id) {
        return null;
    }

    @Override
    public int update(Object entity) {
        return 0;
    }
}
