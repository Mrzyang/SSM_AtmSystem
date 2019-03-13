package com.wust.controller;

import com.wust.pojo.User;
import com.wust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String test(){
        return "index";
    }
    @ResponseBody
    @RequestMapping("/json")
    public User testJson(){
        return userService.getUserById(1);
    }

}
