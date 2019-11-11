package com.dao.iuserdao;

import com.mybatis.dao.IUserDAO;
import com.mybatis.pojo.User;
import com.mybatis.utils.MyBatisUtils;
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
