package com.transaction_anno.service.impl;

import com.transaction_anno.dao.IAccount2DAO;
import com.transaction_anno.service.IAccount2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("service2")
@Transactional
public class Account2ServiceImpl implements IAccount2Service {
    @Autowired
    private IAccount2DAO iAccount2DAO;
    @Override
    public void transfer(int outID, int inID, double money) {
        iAccount2DAO.outMoneny(outID,money);
//        int i=1/0;
        iAccount2DAO.inMoneny(inID,money);
    }
}
