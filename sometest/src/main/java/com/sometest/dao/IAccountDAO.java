package com.sometest.dao;

import com.sometest.pojo.Account;

import java.util.List;

public interface IAccountDAO {
    public List<Account> findAll();
}
