package com.kd.bysj.stushop.controller;

import com.kd.bysj.stushop.entity.User;
import com.kd.bysj.stushop.entity.UserLock;
import com.kd.bysj.stushop.service.UserService;
import com.kd.bysj.stushop.validate.Login;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Resource(name = "userService")
    UserService userService;
    //登录页
    @RequestMapping("doLogin")
    public ModelAndView login(@ModelAttribute("login") @Validated(Login.class) User user,
                              BindingResult bindingResult, HttpSession session) {
        ModelAndView mv = new ModelAndView();
        if (bindingResult.hasErrors()) {//账户号或者密码为空
            mv.setViewName("login");
        }else {
            int result=userService.loginCheck(user);//检测用户是否存在，返回的是数量count(*)
            if(result==1) {//用户存在
                User u = userService.login(user);
                UserLock userLock=userService.checkAccountLockCount(user);
                int id=userLock.getId();
                int count=userLock.getCount();
                if (u == null) {//用户名或者密码输入错误,对账户上锁
                    mv.setViewName("login");
                    if(count>=5) {
                        userLock.setLock_time(String.valueOf(System.currentTimeMillis()));
                        int lock=userService.lockAccount(userLock);
                        if(lock==1) {
                            mv.addObject("msg", "账户已锁，请在6个小时后尝试或者找回密码。。");
                        }
                    }else {
                        userLock.setCount(userLock.getCount()+1);
                        int r=userService.updateCount(userLock);//更新次数
                        if(r==1) {
                            mv.addObject("msg", "用户名或者密码错误!剩余登录次数"+(4-count));
                        }
                    }
                }else {//输入正确
                    int lock=userLock.getLock();
                    if (lock == 1) {//证明上过锁
                        String temp=userService.getLockTime(id);//获取上锁时间
                        long lock_time=Long.parseLong(temp);
                        long now=System.currentTimeMillis();
                        long hours=(now-lock_time)/3600000;
                        if(hours>=6) {
                            //解锁
                            int l=userService.unlockAccount(id);
                            if(l==1) {
                                if(u.getIdentify()==2) {//普通用户
                                    mv.setViewName("index");
                                    session.setAttribute("User", u);
                                    mv.addObject("username", u.getUserName());
                                }else {
                                    mv.setViewName("admin-index");
                                    session.setAttribute("Admin", u);
                                    //System.out.println("----------------------------------"+((User)session.getAttribute("Admin")).getUsername());
                                }
                            }
                        }else {
                            mv.setViewName("login");
                            mv.addObject("msg", "账户暂未解锁，请在"+(6-hours)+"小时后登录！");
                        }
                    }else {//等于null证明是从来没有出错
                        mv.setViewName("index");
                        mv.addObject("username", u.getUserName());
                        session.setAttribute("User", u);
                    }
                }
            }else {
                mv.setViewName("login");
                mv.addObject("msg", "该账户不存在！");
            }
        }
        return mv;
    }
}
