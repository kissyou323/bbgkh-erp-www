package com.bbgkh.service.impl;

import com.bbgkh.dao.ISaleDao;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.PO.SaleInfoPO;
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
    public BaseInfo selectById(String id) {
        BaseInfo baseInfo = new BaseInfo("0","查询销售数据成功");
        List<SaleInfoPO> saleInfoPOS = saleDao.selectById(id);
        baseInfo.setObject(saleInfoPOS);
        return baseInfo;
    }

    @Override
    public int update(Object entity) {
        return saleDao.update(entity);
    }

    @Override
    public BaseInfo deleteById(String id) {
        BaseInfo baseInfo ;
        int a = saleDao.deleteById(id);
        if (a==1) {
            baseInfo = new BaseInfo("0","删除销售数据成功");
        }else
            baseInfo = new BaseInfo("200","删除销售数据失败");
        return baseInfo;
    }
}
