package com.wust.service.impl;

import com.wust.mapper.UserMapper;
import com.wust.pojo.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceImplTest {
    private ApplicationContext applicationContext;
    @BeforeEach
    void setUp() {
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void getUserById() {
        UserMapper userMapper= (UserMapper) applicationContext.getBean("UserMapper");
        User user=userMapper.getUserById(1);
        System.out.println(user);
    }
}