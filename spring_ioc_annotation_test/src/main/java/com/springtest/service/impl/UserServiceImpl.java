package com.springtest.service.impl;

import com.springtest.service.IUserService;
import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserServiceImpl implements IUserService {
    @Override
    public void saveUser() {
        System.out.println("保存了用户！！！");
    }
}
