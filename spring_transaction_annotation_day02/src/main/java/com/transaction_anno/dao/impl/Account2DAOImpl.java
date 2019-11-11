package com.transaction_anno.dao.impl;

import com.transaction_anno.dao.IAccount2DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao2")
public class Account2DAOImpl implements IAccount2DAO {
    @Autowired
    private JdbcTemplate template;
    @Override
    public void outMoneny(int outID, double money) {
        String sql = "update account set money = money-? where id = ?";
        template.update(sql,money,outID);
    }

    @Override
    public void inMoneny(int inID, double money) {
        String sql = "update account set money = money+? where id = ?";
        template.update(sql,money,inID);
    }
}
