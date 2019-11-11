package com.mybatis5.dao;

import com.mybatis5.pojo.Account;

import java.util.List;

public interface IAccountDAO {
    public List<Account> findById(int accountid);
}
