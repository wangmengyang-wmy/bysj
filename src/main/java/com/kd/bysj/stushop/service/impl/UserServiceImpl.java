package com.kd.bysj.stushop.service.impl;

import com.kd.bysj.stushop.dao.UserMapper;
import com.kd.bysj.stushop.entity.User;
import com.kd.bysj.stushop.entity.UserLock;
import com.kd.bysj.stushop.service.UserService;
import com.kd.bysj.stushop.utils.PhoneValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    UserMapper userMapper;

    @Override
    public int loginCheck(User user) {
        //获取登录码
        String usercode=user.getUserCode();
        if(usercode.contains("@")) {//邮箱
            user.setUserEmail(usercode);
        }else if(PhoneValidate.isMobilePhone(usercode)){//手机号
            user.setUserTel(usercode);
        }else {//用户名
            user.setUserName(usercode);
        }
        //user.setUserpwd(MDFive.md5Password(user.getUserpwd()));//MD5加密
        return userMapper.loginCheck(user);
    }

    @Override
    public User login(User user) {
        //获取登录码
        String usercode=user.getUserCode();
        if(usercode.contains("@")) {//邮箱
            user.setUserEmail(usercode);
        }else if(PhoneValidate.isMobilePhone(usercode)){//手机号
            user.setUserTel(usercode);
        }else {//用户名
            user.setUserName(usercode);
        }
        //user.setUserpwd(MDFive.md5Password(user.getUserpwd()));//MD5加密
        return userMapper.login(user);
    }

    @Override
    public UserLock checkAccountLockCount(User user) {
        return userMapper.checkAccountLockCount(user);
    }

    @Override
    public int updateCount(UserLock userLock) {
        return userMapper.updateCount(userLock);
    }

    @Override
    public int lockAccount(UserLock userLock) {
        return userMapper.lockAccount(userLock);
    }

    @Override
    public String getLockTime(Integer user_id) {
        return userMapper.getLockTime(user_id);
    }

    @Override
    public int unlockAccount(Integer user_id) {
        return userMapper.unlockAccount(user_id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
}
