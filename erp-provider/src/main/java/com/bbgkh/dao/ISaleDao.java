package com.bbgkh.dao;

import com.bbgkh.dao.BaseDAO;
import org.springframework.stereotype.Repository;

/**
 * Created by lixiang on 14/12/2016.
 */
@Repository
public interface ISaleDao extends BaseDAO {
    int deleteById(String id);
}
