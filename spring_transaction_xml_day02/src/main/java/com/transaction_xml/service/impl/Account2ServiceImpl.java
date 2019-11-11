package com.transaction_xml.service.impl;

import com.transaction_xml.dao.IAccount2DAO;
import com.transaction_xml.service.IAccount2Service;

public class Account2ServiceImpl implements IAccount2Service {
    private IAccount2DAO iAccount2DAO;

    public void setiAccount2DAO(IAccount2DAO iAccount2DAO) {
        this.iAccount2DAO = iAccount2DAO;
    }

    @Override
    public void transfer(int outID, int inID, double money) {
        iAccount2DAO.outMoneny(outID,money);
//        int i=1/0;
        iAccount2DAO.inMoneny(inID,money);
    }
}
