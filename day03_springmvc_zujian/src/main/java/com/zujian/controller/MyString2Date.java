package com.zujian.controller;

import com.zujian.domain.User;
import com.zujian.service.IUserService;
import com.zujian.service.impl.UserServiceImpl;
import com.zujian.utils.MySqlSesion;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/string2date")
public class MyString2Date {

    @RequestMapping("/mydate")
    public String save(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/myexception")
    public String save2(User user){
        IUserService service = new UserServiceImpl();
        service.saveUser(user);
        return "success";
    }

    @RequestMapping("/myintercepter")
    public String save3(User user){
        IUserService service = new UserServiceImpl();
        service.saveUser(user);
        return "success";
    }
}
