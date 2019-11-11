package com.dao.iuserdao;

import com.mybatis2.dao.IUserDAO2;
import com.mybatis2.pojo.User;
import com.mybatis2.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class IUserDAOTest2 {
    @Test
    public void findAllTest(){
        IUserDAO2 userDAO = MyBatisUtils.getSqlSession().getMapper(IUserDAO2.class);
        List<User> users = userDAO.findAllandAccount();
        for (User user : users) {
            System.out.println("user->>"+user);
        }
    }
}
