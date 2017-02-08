package com.bbgkh.dao;

import com.bbgkh.model.DTO.MemberInfoDTO;
import com.bbgkh.model.PO.MemberInfoPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang01 on 2/6/2017.
 */
@Repository
public interface IMemberDao extends BaseDAO {

    public int addToMemberSale(@Param("memId") Integer memId,@Param("saleId") Integer saleId);

    public List selectByMobileOrCard(MemberInfoPO memberInfo);

}
