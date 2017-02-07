package com.bbgkh.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by lixiang01 on 2/6/2017.
 */
@Repository
public interface IMemberDao extends BaseDAO {

    public int addToMemberSale(@Param("memId") Integer memId,@Param("saleId") Integer saleId);
}
