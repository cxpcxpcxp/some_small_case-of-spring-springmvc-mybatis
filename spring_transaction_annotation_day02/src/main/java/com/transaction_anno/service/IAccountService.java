package com.transaction_anno.service;

public interface IAccountService {
    public void transfer(int outID, int inID, double money);
}
