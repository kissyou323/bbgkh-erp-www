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
            a= memberDao.insert(memberInfo);
        } catch (Exception e) {
            logger.error("插入会员信息失败",e);
            baseInfo = new BaseInfo("100","插入会员信息失败");

        }

        if(a!=1){
            baseInfo = new BaseInfo("100","插入会员信息失败");
        }
        return baseInfo;
    }

    @Override
    public BaseInfo addOldMemberData(Object entity) {
        OldMemberDataDTO oldMemberData = (OldMemberDataDTO) entity;
        MemberInfoPO memberInfo = oldMemberData.getMemberInfo();
        SaleInfoPO saleInfo = oldMemberData.getSaleInfo();
        saleInfo.setSaleTime("2017-01-01 1:1:1");
        saleDao.insert(saleInfo);
        return null;
    }


}
