package com.transaction_anno.dao;

public interface IAccountDAO {

    void outMoney(int outID, double money);

    void inMoney(int inID, double money);
}
