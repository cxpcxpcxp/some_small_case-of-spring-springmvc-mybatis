package com.spring01.factory;

import com.spring01.service.IAccountService;
import com.spring01.service.impl.AccountServiceImpl;


public class MySqlSeeeionFactory {
    public static IAccountService openSession(){
        return new AccountServiceImpl();
    }
}
