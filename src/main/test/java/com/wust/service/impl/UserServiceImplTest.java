package com.wust.service.impl;

import com.wust.pojo.User;
import com.wust.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    public void getUserById() {
        User user=userService.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void getAllUsers(){
        List userList=userService.getAllUsers();
        System.out.println(userList);
    }
    @Test
    public void  getCardNum(){
        int cardNum=userService.getCardNum(1);
        System.out.println("卡数量:"+cardNum);
    }
    @Test
    public void getTotalMoney(){
        double totalMoney=userService.getTotalMoney(1);
        System.out.println("id为1的用户有"+totalMoney);
    }



}