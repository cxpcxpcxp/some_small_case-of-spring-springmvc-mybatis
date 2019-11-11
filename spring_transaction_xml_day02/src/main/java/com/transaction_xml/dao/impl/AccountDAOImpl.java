package com.transaction_xml.dao.impl;

import com.transaction_xml.dao.IAccountDAO;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDAOImpl implements IAccountDAO {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

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
