package com.wust.service.impl;

import com.wust.mapper.UserMapper;
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
    public void getUser(){
        User user=new User();
        //user.setUsername("zy");
        user.setTelphone("123456");
        user.setPassword("123");
        List users=userService.getUser(user);
        System.out.println(users.get(0));
    }
}