package com.transaction_anno.dao.impl;

import com.transaction_anno.dao.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl implements IAccountDAO {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void outMoney(int outID, double money) {
        String sql = "update aopaccount set money = money-? where id = ?";
        template.update(sql,money,outID);
    }

    @Override
    public void inMoney(int inID, double money) {
        String sql = "update aopaccount set money = money+? where id = ?";
        template.update(sql,money,inID);
    }
}
