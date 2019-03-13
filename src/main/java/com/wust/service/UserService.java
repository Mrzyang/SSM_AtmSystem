package com.wust.service;


import com.wust.pojo.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);
    List getUser(User user);

}
