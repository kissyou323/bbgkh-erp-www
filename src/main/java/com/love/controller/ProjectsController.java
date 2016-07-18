package com.love.controller;

import com.alibaba.fastjson.JSON;
import com.love.model.Projects;
import com.love.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public List<Projects>  project(){
        List<Projects> projectses = projectsService.selectAll();
        return projectses;
    }

}
