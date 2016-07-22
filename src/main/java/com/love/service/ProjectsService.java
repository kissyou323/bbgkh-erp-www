package com.love.service;

import com.love.model.Projects;

/**
 * Created by lixiang on 2016/7/18.
 */
public interface ProjectsService extends BaseService<Projects> {
    public void updateProject(Projects projects);

    public void distribute(int memId,int money);
}
