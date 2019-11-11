package com.dao.iuserdao;

import com.mybatis3.dao.IAccountDAO;
import com.mybatis3.dao.IUserDAO;
import com.mybatis3.pojo.Account;
import com.mybatis3.pojo.User;
import com.mybatis3.utils.MyBatisUtils;
import org.junit.Test;

import java.util.List;

public class IUserDAOTest {
    @Test
    public void findAllTest(){
        IAccountDAO accountDAO = MyBatisUtils.getSqlSession().getMapper(IAccountDAO.class);
        List<Account> accounts = accountDAO.findAll();
        for (Account account : accounts) {
            System.out.println("account->>"+account);
        }
    }
}
