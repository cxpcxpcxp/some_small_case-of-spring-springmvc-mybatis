package com.aop1.service.impl;

import com.aop1.service.IUserService;

public class IUserServicceImpl implements IUserService {
    @Override
    public void saveUser() {
        System.out.println("保存用户。。。");
    }
}
