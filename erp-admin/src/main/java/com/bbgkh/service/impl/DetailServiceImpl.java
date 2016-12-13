//package com.bbgkh.service.impl;
//
//import com.bbgkh.dao.DetailDAO;
//import com.bbgkh.dao.ProjectsDAO;
//import com.bbgkh.model.Detail;
//import com.bbgkh.model.Projects;
//import com.bbgkh.service.DetailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * Created by lixiang on 2016/7/18.
// */
//@Service
//public class DetailServiceImpl  implements DetailService  {
//
//    @Autowired
//    private DetailDAO detailDAO;
//
//    @Autowired
//    private ProjectsDAO projectsDAO;
//
//
//
//    @Override
//    public void insert(Detail entity) {
//        detailDAO.insert(entity);
//        Projects project = new Projects();
//        project.setId(entity.getProjectId());
//        if(entity.getInorout()==1){
//            project.setAlready(-entity.getAmount());
//        }else {
//            project.setAlready(entity.getAmount());
//        }
//        projectsDAO.updateProject(project);
//    }
//
//    @Override
//    public List selectAll() {
//        System.out.println(detailDAO);
//        return detailDAO.selectAll();
//    }
//
//    @Override
//    public List selectById(int id) {
//        System.out.println(detailDAO);
//        return detailDAO.selectById(id);
//    }
//}
