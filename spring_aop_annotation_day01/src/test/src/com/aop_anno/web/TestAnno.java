package com.aop_anno.web;

import com.aop_anno.config.MyConfig;
import com.aop_anno.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnno {
    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        IUserService userServive = context.getBean("userService", IUserService.class);
        userServive.findAll();
    }
}
