package com.springlistid.webtest;

import com.springlistid.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServletTest {
    @Test
    public void userServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IUserService userService1 = (IUserService) context.getBean("userService");
        IUserService userService2 = context.getBean("userService",IUserService.class);
        System.out.println(userService1);
        System.out.println(userService2);
        userService1.saveUser();
    }
}
