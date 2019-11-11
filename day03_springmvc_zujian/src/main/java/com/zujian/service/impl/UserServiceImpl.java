package com.zujian.service.impl;

import com.zujian.dao.IUserDAO;
import com.zujian.dao.impl.UserDAOImpl;
import com.zujian.domain.User;
import com.zujian.service.IUserService;

public class UserServiceImpl implements IUserService {
    IUserDAO dao = new UserDAOImpl();
    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
        System.out.println("service方法执行了");
    }
}
