package com.transaction_xml.dao;

public interface IAccountDAO {

    void outMoney(int outID, double money);

    void inMoney(int inID, double money);
}
