package com.param.controller;

import com.param.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paramServlet")
public class ParamServlet {
//    一般方式获取请求参数
    @RequestMapping("/normalparams")
    public String normalparams(String username,String userpwd){
        System.out.println(username+"::"+userpwd);
        return "normalparamsok";
    }

//    对象方式获取请求参数
    @RequestMapping("/objparams")
    public String objparams(User user){
        System.out.println(user.getUsername()+"::"+user.getUserpwd());
        return "objparamsok";
    }
}
