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
    public BaseInfo insert(Object entity) {
        MemberInfoDTO memberInfoDTO = (MemberInfoDTO)entity;
        MemberInfoPO memberInfo = new MemberInfoPO();
        BeanUtils.copyProperties(memberInfoDTO,memberInfo);
        BaseInfo baseInfo = new BaseInfo("0","插入会员信息成功");

        int a  = 3;
        try {
            MemberInfoPO query = new MemberInfoPO();
            query.setMobilePhone(memberInfo.getMobilePhone());
            query.setCustomerUid(memberInfo.getCustomerUid());
            List<MemberInfoPO> memberInfoS = memberDao.selectByMobileOrCard(query);

            if(memberInfoS.size()>0){
                //   memberDao.update(memberInfo);
                baseInfo = new BaseInfo("300","会员信息已存在");
                return baseInfo;
            }else{
                a= memberDao.insert(memberInfo);
            }

        } catch (Exception e) {
            logger.error("插入会员信息失败",e);
            baseInfo = new BaseInfo("200","插入会员信息失败");

        }

        if(a!=1){
            baseInfo = new BaseInfo("200","插入会员信息失败");
        }
        return baseInfo;
    }

    @Override
    @Transactional
    public BaseInfo addOldMemberData(Object entity) {

        BaseInfo baseInfo = new BaseInfo("0","插入数据成功");

        OldMemberDataDTO oldMemberData = (OldMemberDataDTO) entity;
        MemberInfoPO memberInfo = oldMemberData.getMemberInfo();
        SaleInfoPO saleInfo = oldMemberData.getSaleInfo();
        saleInfo.setSaleTime("2017-01-01 1:1:1");
        //判断如果这个会员不存在的，则进行插入操作， 如果存在，则只进行更新 ，这里只根据手机进行判断
        MemberInfoPO query = new MemberInfoPO();
        query.setMobilePhone(memberInfo.getMobilePhone());
        query.setCustomerUid(memberInfo.getCustomerUid());
        List<MemberInfoPO> memberInfoS = memberDao.selectByMobileOrCard(query);

        if(memberInfoS.size()>0){
         //   memberDao.update(memberInfo);
            memberInfo.setId(memberInfoS.get(0).getId());
        }else{
            memberDao.insert(memberInfo);
        }
        saleDao.insert(saleInfo);
        memberDao.addToMemberSale(memberInfo.getId(),saleInfo.getId());
        return baseInfo ;
    }


}
