package com.mybatis3.dao;

import com.mybatis3.pojo.Account;

import java.util.List;

public interface IAccountDAO {
    public List<Account> findAll();
}
