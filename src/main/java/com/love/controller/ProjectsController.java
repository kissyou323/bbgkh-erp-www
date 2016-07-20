package com.love.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.love.model.DTO.ProjectsDTO;
import com.love.model.Projects;
import com.love.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lixiang on 2016/7/18.
 */
@Controller
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @RequestMapping("")
    @ResponseBody
    public PageInfo<Projects> project(HttpServletRequest request){
        int memId = (int) request.getSession().getAttribute("memId");
        PageHelper.startPage(1,10);
        List<Projects> projectses = projectsService.selectById(memId);
        PageInfo<Projects> page = new PageInfo<>(projectses);
        request.getSession(false).setAttribute("projects",projectses);
        return page;
    }

    @RequestMapping(value = "addProject" , method= RequestMethod.POST)
    @ResponseBody
    public void addProject(ProjectsDTO projectsDTO ,HttpServletRequest request){
        int memId =(int) request.getSession().getAttribute("memId");
        Projects projects = new Projects();
        projects.setTotal(projectsDTO.getTotal());
        projects.setRemark(projectsDTO.getRemark());
        projects.setMemId(memId);
        projectsService.insert(projects);
    }


}
