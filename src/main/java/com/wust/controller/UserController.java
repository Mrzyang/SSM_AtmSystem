package com.wust.controller;

import com.wust.utils.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/login")
    public String loginUI(){
        return "login";
    }
    @RequestMapping("/doLogin")
    public ResultData doLogin(String username , String password){
        return null;
    }

}
