package com.aop.xmltest;

import com.aop.service.IAccountService;
import com.aop.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService",IAccountService.class);
        accountService.find();
    }
}
