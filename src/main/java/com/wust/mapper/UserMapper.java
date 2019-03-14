package com.wust.mapper;

import com.wust.pojo.User;

import java.util.List;


public interface UserMapper {
     User getUserById(int id);
     // 根据用户名/手机号 和密码来获取user
     List getUser(User user);
}

