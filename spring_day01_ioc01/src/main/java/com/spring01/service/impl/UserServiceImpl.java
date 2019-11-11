package com.spring01.service.impl;

import com.spring01.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser() {
        System.out.println("保存了用户！！！===》无参构造方法创建对象");
    }

    public void initMethod(){
        System.out.println("创建之前。。。。。");
    }
}
