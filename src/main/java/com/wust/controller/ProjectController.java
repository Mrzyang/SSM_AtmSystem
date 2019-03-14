package com.wust.controller;

import com.wust.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping("/financialProject")
    public String financialProjectUI(Map<String,Object> map){
        List projectList=projectService.getAllProjects();
        map.put("projectList",projectList);
        return "financialProject";
    }

    @RequestMapping("/insertProject")
    public String insertProjectUI(){
        return "insertProject";
    }
    @RequestMapping("/projectDetail")
    public String projectDetailUI(){
        return "projectDetail";
    }
}
