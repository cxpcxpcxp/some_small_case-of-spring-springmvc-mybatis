package com.ioc_xml.servlet;

import com.ioc_xml.domain.User;
import com.ioc_xml.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestServlet {
    @Test
    public void findAllTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
    @Test
    public void findByIdTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        int uid = 5;
        User byId = userService.findById(uid);
        System.out.println(byId);
    }

    @Test
    public void findByNameTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        String username="%加盐盐%";
        List<User> userByName = userService.findUserByName(username);
        for (User user : userByName) {
            System.out.println(user);
        }
    }

    @Test
    public void saveUserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        User user = new User();
        user.setUser_name("ioc_xml01");
        user.setUser_pwd("123");
        userService.saveUser(user);
    }

    @Test
    /**
     * 需要解除外键约束
     */
    public void deleteUserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        int uid = 5;
        userService.deleteUser(uid);
    }

    @Test
    public void updateUserTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = context.getBean("userService", IUserService.class);
        User user = new User();
        user.setId(9);
        user.setUser_name("ioc_xml02");
        user.setUser_pwd("456");
        userService.updateUser(user);
    }
}
