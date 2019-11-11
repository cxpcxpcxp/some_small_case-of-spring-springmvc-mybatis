package com.aop_anno.service.impl;

import com.aop_anno.service.IUserService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Override
    public void findAll() {
        System.out.println("查询所有用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void save() {
        System.out.println("增加用户");
    }
}
