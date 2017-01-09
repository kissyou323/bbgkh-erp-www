package com.bbgkh.dao;

import com.bbgkh.model.PO.CustomerPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by lixiang on 12/16/2016.
 */
@Repository
public interface IUserDao extends BaseDAO {

    List<CustomerPO> validateUser(@Param("uid") String uid, @Param("password") String password);

    /**
     * Shiro的登录验证，通过用户名查询用户信息
     * @param username
     * @return
     */
    public CustomerPO findUserByUsername(String username) ;

    /**
     * 根据账号查找角色名称
     * @param username
     * @return
     */
    public Set<String> findRoles(String username) ;

    /**
     * 根据账号查找权限
     * @param username
     * @return
     */
    public Set<String> findPermissions(String username) ;
}
