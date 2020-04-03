package com.kd.bysj.stushop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DefaultPageController {
    /**
     * 输入域名默认的显示页面
     */
    @RequestMapping("")
    public ModelAndView defaultpage(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
