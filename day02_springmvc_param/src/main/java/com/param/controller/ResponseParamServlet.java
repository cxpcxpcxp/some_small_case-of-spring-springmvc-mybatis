package com.param.controller;

import com.param.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/responseParamServlet")
public class ResponseParamServlet {
    @RequestMapping("/response1")
    public String response1(){
        //添加forward前缀之后，页面会进行转发，但是不会经过视图解析器
        return "forward:/WEB-INF/pages/getParamsOK.jsp";
    }


    @RequestMapping("/response2")
    public @ResponseBody User  response2(User u){
        System.out.println(u);
        User user = new User();
        user.setUsername("派大星");
        user.setUserpwd("147");
        return user;
    }

    @RequestMapping("/response3")
    public @ResponseBody User   response3(@RequestBody User u){
        System.out.println(u);
        User user = new User();
        user.setUsername("派大星");
        user.setUserpwd("147");
        return user;
    }


    @RequestMapping("/response4")
    public String response4(){
        //添加forward前缀之后，页面会进行转发，但是不会经过视图解析器
        return "forward:/WEB-INF/pages/getParamsOK.jsp";
    }
}
