package com.transaction_xml.web;

import com.transaction_xml.service.IAccount2Service;
import com.transaction_xml.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.transfer(1,2,100);
    }

    @Test
    public void tes2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        IAccount2Service account2Service = context.getBean("account2Service", IAccount2Service.class);
        account2Service.transfer(2,3,10.0);
    }
}
