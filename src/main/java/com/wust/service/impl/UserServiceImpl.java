package com.wust.service.impl;

import com.wust.mapper.UserMapper;
import com.wust.pojo.User;
import com.wust.service.UserService;
import com.wust.utils.ResultData;
import com.wust.utils.VerifyCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    HttpSession session;  //这里直接注入session是通过的


    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
    // 根据用户名/手机号 和密码来获取user
    public User getUser(User user){
        List users=userMapper.getUser(user);
        if(users.size()==0)
            return null;
        User user1=(User) users.get(0);
        return user1;
    }
    //判断登陆
     public ResultData doLogin(User user, String verifycode, String verifycodeOfSession){
         ResultData resultData=new ResultData();
         if(verifycode.length()==4){   //设定验证码为4位
             verifycode= VerifyCodeUtils.codeToLowerCase(verifycode);  //前台输入的验证码转为小写字母
             if(verifycodeOfSession.equals(verifycode)){
                 User identifiedUser=getUser(user);
                 if(identifiedUser==null){
                     resultData.setStatus(400);
                     resultData.setMessage("用户名或密码错误!");
                 }else {
                     resultData.setStatus(200);
                     resultData.setMessage("登录成功!");
                     resultData.setData(identifiedUser);
                     session.setAttribute("USER",identifiedUser);
                 }
             }
         }else{
             resultData.setStatus(400);
             resultData.setMessage("验证码输入错误!");
         }
        return resultData;
     }

}
