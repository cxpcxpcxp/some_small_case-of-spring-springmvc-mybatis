package com.aop.service.impl;

import com.aop.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    @Override
    public void add() {
        System.out.println("保存账户");
    }

    @Override
    public void delete() {
        System.out.println("删除账户");
    }

    @Override
    public void update() {
        System.out.println("修改账户");
    }

    @Override
    public void find() {
        System.out.println("查询账户");
    }
}
