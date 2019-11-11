package com.sometest.dao.impl;

import com.sometest.dao.IAccountDAO;
import com.sometest.pojo.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AccountDAOImpl implements IAccountDAO {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Account> findAll() {
        String sql = "select * from account";
        return template.query(sql,new BeanPropertyRowMapper<Account>(Account.class));
    }
}
