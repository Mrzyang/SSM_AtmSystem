package com.wust.mapper;

import com.wust.pojo.User;

import java.util.List;


public interface UserMapper {
     User getUserById(int id);
     // 根据用户名/手机号 和密码来获取user
     List getUser(User user);
     List getAllUsers();
     //查询某个用户所持银行卡总数
     int getCardNum(int id);
     double getToalMoney(int id);
     //获取用户购买理财产品总数
     int getProjectNum(int id);
     List getProjectBought(int id);
}

