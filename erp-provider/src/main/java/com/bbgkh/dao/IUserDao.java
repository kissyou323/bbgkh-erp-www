package com.bbgkh.dao;

import com.bbgkh.model.PO.CustomerPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 12/16/2016.
 */
@Repository
public interface IUserDao extends BaseDAO {
    List<CustomerPO> validateUser(@Param("uid") String uid, @Param("password") String password);
}
