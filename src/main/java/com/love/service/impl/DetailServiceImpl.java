package com.love.service.impl;

import com.love.dao.DetailDAO;
import com.love.dao.ProjectsDAO;
import com.love.model.Detail;
import com.love.model.Projects;
import com.love.service.BaseService;
import com.love.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Service
public class DetailServiceImpl  implements DetailService  {

    @Autowired
    private DetailDAO detailDAO;

    @Autowired
    private ProjectsDAO projectsDAO;



    @Override
    public void insert(Detail entity) {
        detailDAO.insert(entity);
        Projects project = new Projects();
        project.setId(entity.getProjectId());
        if(entity.getInorout()==1){
            project.setAlready(-entity.getAmount());
        }else {
            project.setAlready(entity.getAmount());
        }
        projectsDAO.updateProject(project);
    }

    @Override
    public List selectAll() {
        return detailDAO.selectAll();
    }

    @Override
    public List selectById(int id) {
        return detailDAO.selectById(id);
    }
}
