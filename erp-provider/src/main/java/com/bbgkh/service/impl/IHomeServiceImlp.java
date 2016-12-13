package com.bbgkh.service.impl;


import com.alibaba.fastjson.JSON;
import com.bbgkh.dao.IHomeDao;
import com.bbgkh.model.PO.ProductInfoPO;
import com.bbgkh.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 13/12/2016.
 */
@Service
public class IHomeServiceImlp implements IHomeService {

    @Autowired
    private IHomeDao homeDao;

    @Override
    public void insert(Object entity) {
    }

    @Override
    public List selectAll() {

        List<ProductInfoPO> poList =homeDao.selectAll();
        System.out.println(JSON.toJSONString(poList));
        return poList;

    }

    @Override
    public List selectById(int id) {
        return null;
    }
}
