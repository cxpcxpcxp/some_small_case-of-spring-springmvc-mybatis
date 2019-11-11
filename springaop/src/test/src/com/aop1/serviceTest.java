package com.aop1;

import com.aop1.service.IUserService;
import com.aop1.util.MyLog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class serviceTest {
    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IUserService userService = context.getBean("userService",IUserService.class);
        userService.saveUser();
//        int i=1/0;
    }
}
