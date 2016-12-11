package com.bbgkh.dao;

import com.bbgkh.model.Projects;
import org.springframework.stereotype.Repository;

/**
 * Created by lixiang on 2016/7/18.
 */
@Repository
public interface ProjectsDAO extends BaseDAO<Projects> {
    public void updateProject(Projects projects);

    public void distribute(int memId, int money);
}
