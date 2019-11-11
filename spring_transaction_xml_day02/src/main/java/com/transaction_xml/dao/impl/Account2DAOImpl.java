package com.transaction_xml.dao.impl;

import com.transaction_xml.dao.IAccount2DAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class Account2DAOImpl implements IAccount2DAO {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

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
