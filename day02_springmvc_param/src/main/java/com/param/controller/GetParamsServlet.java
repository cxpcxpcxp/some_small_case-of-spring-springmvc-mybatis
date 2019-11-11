package com.param.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/getParamsServlet")
public class GetParamsServlet {
    @RequestMapping("/getParams1")
    public String getParams1(){
        System.out.println("getParams1");
        return "redirect:getParams2";//重定向方法
    }

    @RequestMapping("/getParams2")
    public String getParams2(Model model){
        model.addAttribute("username", "cxp");
        model.addAttribute("userpwd","122");
        return "getParamsOK";
    }

    @RequestMapping("/getParams3")
    public ModelAndView getParams3(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","小猪佩奇");
        modelAndView.addObject("userpwd","123");
        modelAndView.setViewName("getParamsOK");
        return modelAndView;
    }

    @RequestMapping("/getParams4")
    public String getParams4(){
        return "forward:/WEB-INF/pages/getParamsOK.jsp";//请求转发方法
    }


}
