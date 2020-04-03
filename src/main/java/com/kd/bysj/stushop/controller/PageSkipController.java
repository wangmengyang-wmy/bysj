package com.kd.bysj.stushop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PageSkipController {

    //首页
    @RequestMapping("index.html")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
    //登录页
    @RequestMapping("login.html")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
    //收藏页
    @RequestMapping("favorites.html")
    public ModelAndView favorites() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("favorites");
        return mv;
    }
    //订单页
    @RequestMapping("orders.html")
    public ModelAndView orders() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orders");
        return mv;
    }
    //购物车
    @RequestMapping("cart.html")
    public ModelAndView cart() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cart");
        return mv;
    }
    //帮助页
    @RequestMapping("help.html")
    public ModelAndView help() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("help");
        return mv;
    }

    //注册页
    @RequestMapping("register.html")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }
    //点击忘记密码按钮进入找回密码界面
    @RequestMapping("reset.html")
    public ModelAndView forgetpwd() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("reset");
        return mv;
    }
    //点击忘记密码按钮进入找回密码界面
    @RequestMapping("404.html")
    public ModelAndView fourzerofour() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("404");
        return mv;
    }
    @RequestMapping("500.html")
    public ModelAndView five() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("500");
        return mv;
    }
    @RequestMapping("addressAdmin.html")
    public ModelAndView addressAdmin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addressAdmin");
        return mv;
    }
    @RequestMapping("emptyOrders.html")
    public ModelAndView emptyOrders() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("emptyOrders");
        return mv;
    }
    @RequestMapping("lookforward.html")
    public ModelAndView lookforward() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("lookforward");
        return mv;
    }
    @RequestMapping("orderinfo.html")
    public ModelAndView orderinfo() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orderinfo");
        return mv;
    }
    @RequestMapping("pay_fail.html")
    public ModelAndView pay_fail() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pay_fail");
        return mv;
    }
    @RequestMapping("pay_success.html")
    public ModelAndView pay_success() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pay_success");
        return mv;
    }
    @RequestMapping("payment.html")
    public ModelAndView payment() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("payment");
        return mv;
    }
    @RequestMapping("personage.html")
    public ModelAndView personage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("personage");
        return mv;
    }
    @RequestMapping("orderConfirm.html")
    public ModelAndView orderConfirm() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orderConfirm");
        return mv;
    }
    @RequestMapping("personal_password.html")
    public ModelAndView personal_password() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("personal_password");
        return mv;
    }
    @RequestMapping("product_details.html")
    public ModelAndView product_details() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("product_details");
        return mv;
    }
    @RequestMapping("searchresult.html")
    public ModelAndView searchresult() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("searchresult");
        return mv;
    }
}
