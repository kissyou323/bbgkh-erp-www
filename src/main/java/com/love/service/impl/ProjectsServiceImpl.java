package com.love.service.impl;

import com.love.dao.ProjectsDAO;
import com.love.model.Projects;
import com.love.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    private ProjectsDAO projectsDAO;

    @Override
    public void insert(Projects entity) {
        projectsDAO.insert(entity);
    }

    @Override
    public List selectAll() {
        return projectsDAO.selectAll();
    }

    @Override
    public List selectByMem(int id) {
        return projectsDAO.selectByMem(id);
    }


}
