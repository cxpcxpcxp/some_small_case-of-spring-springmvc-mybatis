package com.ssm.web;

import com.ssm.pojo.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/findall")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ok");
        modelAndView.addObject("user_name","hhh");
        modelAndView.addObject("user_pwd","147");
        return modelAndView;
    }


    @RequestMapping("/findUser")
    public ModelAndView findUser(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.findAll();
        modelAndView.setViewName("userList");
        modelAndView.addObject("userList",userList);
        return modelAndView;
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:findUser";
    }
}
