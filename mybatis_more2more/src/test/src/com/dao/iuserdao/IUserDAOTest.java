package com.dao.iuserdao;

import com.mybatis4.dao.IUserDAO;
import com.mybatis4.pojo.User;
import com.mybatis4.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class IUserDAOTest {
    @Test
    public void findAllTest(){
        IUserDAO userDAO = MyBatisUtils.getSqlSession().getMapper(IUserDAO.class);
        List<User> users = userDAO.findAll();
        for (User user : users) {
            System.out.println("user->>"+user);
        }
    }
}
