package com.bbgkh.service.impl;

import com.bbgkh.dao.ISaleDao;
import com.bbgkh.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 14/12/2016.
 */
@Service
public class ISaleServiceImpl implements ISaleService {

    @Autowired
    private ISaleDao saleDao;

    @Override
    public int insert(Object entity) {
        return saleDao.insert(entity);
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public List selectById(String id) {
        return null;
    }

    @Override
    public int update(Object entity) {
        return saleDao.update(entity);
    }
}
