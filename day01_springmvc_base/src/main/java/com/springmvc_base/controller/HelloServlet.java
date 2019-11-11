package com.springmvc_base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloServlet {
    @RequestMapping(path = "/hello")
    public String hello(){
        System.out.println("helloservlet。。。。");
        return "success";
    }
}
