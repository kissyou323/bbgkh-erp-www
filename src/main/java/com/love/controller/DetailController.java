package com.love.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.love.model.Detail;
import com.love.model.Projects;
import com.love.service.DetailService;
import com.love.service.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lixiang on 2016/7/17.
 */
@Controller
@RequestMapping("/detail")
public class DetailController extends BaseController{

    @Autowired
    private DetailService detailService;


    @RequestMapping("/{id}")
    @ResponseBody
    public PageInfo<Detail> detail(@PathVariable int id){

        System.out.println(id);
        PageHelper.startPage(1,10);
        List<Detail> details = detailService.selectById(id);
        PageInfo<Detail> page = new PageInfo<>(details);
        testMaven();
        return page;
    }
    @RequestMapping("addDetail")
    @ResponseBody
    public String addDetail(Detail detail , HttpServletRequest request){
        List<Projects> projects = (List<Projects>) request.getSession().getAttribute("projects");

        Integer already =   projects.stream()
                .filter(projects1->projects1.getId()==detail.getProjectid())
                .map(Projects::getAlready)
                .collect(Collectors.toList()).get(0);
        if(already<detail.getAmount()){
            return "所申请超出预算";
        }
        detailService.insert(detail);
        return "OK";
    }

public void testMaven(){
    System.out.println("out");
}

}
