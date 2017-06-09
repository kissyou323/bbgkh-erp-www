package com.bbgkh.service.impl;

import com.bbgkh.dao.IMemberDao;
import com.bbgkh.dao.ISaleDao;
import com.bbgkh.model.BO.SaleInfoBO;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.DTO.SaleInfoDTO;
import com.bbgkh.model.PO.MemberInfoPO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.ISaleService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by lixiang on 14/12/2016.
 */
@Service
public class ISaleServiceImpl implements ISaleService {

    @Autowired
    private ISaleDao saleDao;

    @Autowired
    private IMemberDao memberDao;

    @Override
    public BaseInfo insert(Object entity) {
        BaseInfo baseInfo = null;
        SaleInfoBO saleInfo = (SaleInfoBO) entity;
        SaleInfoPO saleInfoPO = new SaleInfoPO();
        try {
            BeanUtils.copyProperties(saleInfoPO,saleInfo);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (saleInfo.getMobilePhone().trim().equals("")){
            //如果会员手机号为空，则只插入销售数据
                saleDao.insert(saleInfoPO);
                baseInfo = new BaseInfo("0","插入销售数据成功");
        }else {
            //如果会员手机号不为空，则插入销售数据之后还要同时插入会员-销售数据
            saleDao.insert(saleInfoPO);
            MemberInfoPO memberInfoPO = new MemberInfoPO();
            memberInfoPO.setMobilePhone(saleInfo.getMobilePhone());
            List<MemberInfoPO> memberInfoPOS = memberDao.selectByMobileOrCard(memberInfoPO);
            if(memberInfoPOS.size()>0){
                //会员数据存在，
                memberDao.addToMemberSale(memberInfoPOS.get(0).getId(),saleInfoPO.getId());
                baseInfo = new BaseInfo("0","插入销售数据成功");
            }else{
                //会员数据不存在，要先去添加会员
                baseInfo = new BaseInfo("1","会员信息不存在，需要先添加为本店会员");
            }
        }


        return baseInfo;
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
    public BaseInfo update(Object entity) {
        return null;
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
