package com.wust.controller;

import com.wust.pojo.User;
import com.wust.service.UserService;
import com.wust.utils.ResultData;
import com.wust.utils.VerifyCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;


/*
* 用户操作相关的控制器
* */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //生成验证码
    @RequestMapping("/verifycode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        //生成随机字串
        String verifycode = VerifyCodeUtils.generateVerifyCode(4);
        //存入会话session
        HttpSession session = request.getSession(true);
        //删除以前的
        session.removeAttribute("verifycode");
        session.setAttribute("verifycode", verifycode.toLowerCase());
        //生成图片
        int w = 100, h = 30;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifycode);
    }

    @RequestMapping("/login")
    public String loginUI(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/doLogin",produces = MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public ResultData doLogin(User user,String verifycode,HttpServletRequest request){
        String verifycodeOfSession= (String) request.getSession(true).getAttribute("verifycode");
        return userService.doLogin(user,verifycode,verifycodeOfSession);
    }
    @RequestMapping("/userManage")
    public String userManageUI(Map<String,Object> map){
        List userList=userService.getAllUsers();
        map.put("userList",userList);
        return "userManage";
    }

    @RequestMapping("/personalInfo")
    public String personalInfoUI(int id,Map<String,Object> map){
        double totalMoney=userService.getTotalMoney(id);
        int cardNum=userService.getCardNum(id);
        int projectNum=userService.getProjectNum(id);
        List projectBoughtList =userService.getProjectBought(id);
        map.put("totalMoney",totalMoney);
        map.put("cardNum",cardNum);
        map.put("projectNum",projectNum);
        map.put("projectBoughtList",projectBoughtList);
        return "personalInfo";
    }



}
