package com.dao.iuserdao;

import com.mybatis5.dao.IUserDAO;
import com.mybatis5.pojo.User;
import com.mybatis5.utils.MyBatisUtils;
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
