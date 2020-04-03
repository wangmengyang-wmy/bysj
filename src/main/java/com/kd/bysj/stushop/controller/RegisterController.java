package com.kd.bysj.stushop.controller;

import com.kd.bysj.stushop.entity.User;
import com.kd.bysj.stushop.service.UserService;
import com.kd.bysj.stushop.utils.PhoneValidate;
import com.kd.bysj.stushop.validate.Register;
import org.springframework.util.DigestUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@RestController
public class RegisterController {

    @Resource(name = "userService")
    UserService userService;

    @RequestMapping("doregister")
    public ModelAndView doregister(@ModelAttribute("register") @Validated(Register.class) User user,
                                   BindingResult bindingResult) {
        ModelAndView mv=new ModelAndView();
        if(bindingResult.hasErrors()) {
            mv.setViewName("register");
        }else {
            String pwd=user.getUserPwd();
            boolean flag=false;
            String []ch= {".","?","\\"};
            for(String s:ch) {
                if(pwd.contains(s)) {
                    mv.addObject("pwd", "密码中不能包含\"?./\\\"等特殊字符");
                    flag=true;
                    break;
                }
            }
            String tel=user.getUserTel();
            boolean flag1= PhoneValidate.isMobilePhone(tel);//false:为不符合标准的
            if(!flag1) {
                mv.addObject("tel", "手机号不符合要求！");
            }
            if(flag&&!flag1) {
                mv.setViewName("register");
            }else {
                user.setUserPwd(DigestUtils.md5DigestAsHex(user.getUserPwd().getBytes()));
                int result=userService.insert(user);
                if (result == 1) {
                    mv.setViewName("login");
                }else {
                    mv.setViewName("register");
                }
            }
        }
        return mv;
    }
}
