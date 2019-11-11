package com.spring01.service.impl;

import com.spring01.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    @Override
    //此方法啊只能从工厂对象中获取
    public void findAccount() {
        System.out.println("查询寻账户===》静态方法创建对象");
    }
}
