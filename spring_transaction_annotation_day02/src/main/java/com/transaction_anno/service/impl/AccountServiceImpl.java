package com.transaction_anno.service.impl;

import com.transaction_anno.dao.IAccountDAO;
import com.transaction_anno.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;
    @Override
    public void transfer(int outID, int inID, double money) {
        accountDAO.outMoney(outID,money);
//        int i = 1/0;
        accountDAO.inMoney(inID,money);
        System.out.println("转账成功");
    }
}
