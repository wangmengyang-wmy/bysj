package com.kd.bysj.stushop.service;

import com.kd.bysj.stushop.entity.User;
import com.kd.bysj.stushop.entity.UserLock;

public interface UserService {
    int loginCheck(User user);
    User login(User user);
    UserLock checkAccountLockCount(User user);
    int lockAccount(UserLock userLock);
    int updateCount(UserLock userLock);
    String getLockTime(Integer user_id);
    int unlockAccount(Integer user_id);
    int insert(User record);
}
