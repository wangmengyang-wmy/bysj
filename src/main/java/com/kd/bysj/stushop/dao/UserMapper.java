package com.kd.bysj.stushop.dao;

import com.kd.bysj.stushop.entity.User;
import com.kd.bysj.stushop.entity.UserLock;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserMapper {
    int loginCheck(User user);

    User login(User user);

    UserLock checkAccountLockCount(User user);

    int lockAccount(UserLock userLock);

    int updateCount(UserLock userLock);

    String getLockTime(Integer user_id);

    int unlockAccount(Integer user_id);

    int insert(User record);

    int deleteByPrimaryKey(Integer id);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);



}