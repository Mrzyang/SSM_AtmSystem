package com.wust.service;


import com.wust.pojo.User;
import com.wust.utils.ResultData;

import java.util.List;


public interface UserService {
    User getUserById(int id);
    // 根据用户名/手机号 和密码来获取user
    User getUser(User user);
    ResultData doLogin(User user , String verifycode, String verifycodeOfSession);
    List getAllUsers();
    int getCardNum(int id);
    double getTotalMoney(int id);
    int getProjectNum(int id);
    List getProjectBought(int id);

}
