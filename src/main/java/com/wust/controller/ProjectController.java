package com.wust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
    @RequestMapping("/financialProject")
    public String financialProjectUI(){
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
