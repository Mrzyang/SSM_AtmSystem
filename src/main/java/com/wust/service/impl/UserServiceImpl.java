package com.wust.service.impl;

import com.wust.mapper.UserMapper;
import com.wust.pojo.User;
import com.wust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
    public List getUser(User user){
        return userMapper.getUser(user);
    }
}
