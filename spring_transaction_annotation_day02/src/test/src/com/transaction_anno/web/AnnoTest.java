package com.transaction_anno.web;

import com.transaction_anno.config.MyConfig;
import com.transaction_anno.config.MyConfig2;
import com.transaction_anno.service.IAccount2Service;
import com.transaction_anno.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoTest {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        IAccountService accountService = context.getBean("accountService", IAccountService.class);
        accountService.transfer(1,2,100);
    }

    @Test
    public void test2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        IAccount2Service service2 = context.getBean("service2", IAccount2Service.class);
        service2.transfer(2,3,10.0);

    }
}
