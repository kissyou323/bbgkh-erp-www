package com.bbgkh.dao.impl;

import com.bbgkh.dao.IMemberDao;
import com.bbgkh.model.DTO.MemberInfoDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lixiang01 on 2/6/2017.
 */
public class IMemberDaoImpl implements IMemberDao {
    @Override
    public int insert(Object entity) {
        return 0;
    }

    @Override
    public List selectById(String uid) {
        return null;
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public int update(Object entity) {
        return 0;
    }

    @Override
    public int addToMemberSale( Integer memId,  Integer saleId) {
        return 0;
    }

    @Override
    public List selectByMobileOrCard(MemberInfoDTO memberInfo) {
        return null;
    }
}
