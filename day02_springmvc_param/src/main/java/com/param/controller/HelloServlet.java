package com.param.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Base")
public class HelloServlet {
    @RequestMapping("/hello")
    public String Hello(){
        return "success";
    }
}
