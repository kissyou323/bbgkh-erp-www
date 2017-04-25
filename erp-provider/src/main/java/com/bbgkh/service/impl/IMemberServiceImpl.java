package com.bbgkh.service.impl;

import com.alibaba.fastjson.JSON;
import com.bbgkh.dao.IMemberDao;
import com.bbgkh.dao.ISaleDao;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.DTO.MemberInfoDTO;
import com.bbgkh.model.DTO.OldMemberDataDTO;
import com.bbgkh.model.PO.MemberInfoPO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IMemberService;
import com.bbgkh.utils.UserUtils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


/**
 * Created by lixiang01 on 2/6/2017.
 */
@Service

public class IMemberServiceImpl implements IMemberService {

    @Autowired
    private IMemberDao memberDao;

    @Autowired
    private ISaleDao saleDao;


    @Override
    @Transactional
    public BaseInfo addMemberInfo(Object entity) {

        BaseInfo baseInfo =null;

        MemberInfoDTO memberInfo = (MemberInfoDTO) entity;

        //判断这个会员是否存在
        MemberInfoPO query = new MemberInfoPO();
        query.setMobilePhone(memberInfo.getMobilePhone());
        List<MemberInfoPO> memberInfoS = memberDao.selectByMobileOrCard(query);
        if(memberInfoS.size()==0){
            //会员不存在，直接录入
            query.setMemberName(memberInfo.getMemberName());
            if(!memberInfo.getCardId().trim().equals("")){
                query.setCardId(memberInfo.getCardId());
            }else{
                query.setCardId("");
            }
            memberDao.insert(query);
            baseInfo=new BaseInfo("0","会员信息录入成功");

        }else{
            query.setId(memberInfoS.get(0).getId());
        }

        //如果型号为空，则纯为录入会员信息
        if(memberInfo.getProductSysNo().trim().equals("")){
            if(memberInfoS.size()>0){
                //如果会员已经存在 ， 则返回会员已存在，不用重新录入信息
                baseInfo = new BaseInfo("1","会员已存在，不用重新录入");
            }
        }else {
            //如果型号不为空，即要录入会员信息，也要录入销售信息
            //对价格进行分析，如果存在多个，则录入多条销售信息
            String salePrice = memberInfo.getSalePrice();
            String[] salePrices = salePrice.split("-");
            for (String price : salePrices) {

                SaleInfoPO saleInfo = new SaleInfoPO();
                saleInfo.setProductSysNo(memberInfo.getProductSysNo());
                saleInfo.setSalePrice(Double.parseDouble(price));
                saleInfo.setUid(memberInfo.getUid());
                saleInfo.setSaleNum(1);
                saleDao.insert(saleInfo);
                memberDao.addToMemberSale(query.getId(),saleInfo.getId());
            }

            baseInfo = new BaseInfo("0","录入会员销售数据成功");

        }

        return baseInfo ;
    }
}
