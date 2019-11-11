package com.sometest.service.impl;

import com.sometest.dao.IAccountDAO;
import com.sometest.pojo.Account;
import com.sometest.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    private IAccountDAO accountDAO;

    public void setAccountDAO(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public List<Account> findAll() {
        return accountDAO.findAll();
    }
}
