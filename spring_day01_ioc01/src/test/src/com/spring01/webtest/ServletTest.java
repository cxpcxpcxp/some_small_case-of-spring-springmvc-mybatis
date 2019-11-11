package com.spring01.webtest;

import com.spring01.service.IAccountService;
import com.spring01.service.ICardService;
import com.spring01.service.IUserService;
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

    @Test
    public void accountServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
        accountService.findAccount();
    }

    @Test
    public void cardServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ICardService cardService1 = context.getBean("cardService", ICardService.class);
        System.out.println(cardService1);
        ICardService cardService2 = context.getBean("cardService", ICardService.class);
        System.out.println(cardService2);
        cardService1.findAll();
    }
}
