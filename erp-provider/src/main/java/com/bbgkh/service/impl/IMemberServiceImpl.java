package com.bbgkh.service.impl;

import com.alibaba.fastjson.JSON;
import com.bbgkh.dao.IMemberDao;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.service.IMemberService;
import com.bbgkh.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by lixiang01 on 2/6/2017.
 */
@Service
public class IMemberServiceImpl implements IMemberService {

    @Autowired
    private IMemberDao memberDao;

    @Override
    public BaseInfo insert(Object entity) {

        BaseInfo baseInfo = new BaseInfo("0","插入会员信息成功");

        int a  = 3;
        try {
            a= memberDao.insert(entity);
        } catch (Exception e) {
            logger.error("插入会员信息失败",e);
            baseInfo = new BaseInfo("100","插入会员信息失败");

        }

        if(a!=1){
            baseInfo = new BaseInfo("100","插入会员信息失败");
        }
        return baseInfo;
    }


}
