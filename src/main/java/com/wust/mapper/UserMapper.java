package com.wust.mapper;

import com.wust.pojo.User;

import java.util.List;

public interface UserMapper {
     User getUserById(int id);
     List<User> getUser(User user);
}

