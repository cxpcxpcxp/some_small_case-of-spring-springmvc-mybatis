package com.transaction_xml.service.impl;

import com.transaction_xml.dao.IAccountDAO;
import com.transaction_xml.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private IAccountDAO accountDAO;

    public void setAccountDAO(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void transfer(int outID, int inID, double money) {
        accountDAO.outMoney(outID,money);
        int i = 1/0;
        accountDAO.inMoney(inID,money);
        System.out.println("转账成功");
    }
}
