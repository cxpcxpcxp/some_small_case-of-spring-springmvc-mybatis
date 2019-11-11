package com.ioc_anno.servletTest;

import com.ioc_anno.config.MyApplicationContext;
import com.ioc_anno.dao.IUserDAO;
import com.ioc_anno.domain.User;
import com.ioc_anno.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class userServiceTest {
    @Test
    public void testFindAll(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationContext.class);
        IUserService userService = context.getBean("userService", IUserService.class);
        /*System.out.println(userService);
        IUserDAO userDAO = context.getBean("userDAO", IUserDAO.class);
        System.out.println(userDAO);*/
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}
