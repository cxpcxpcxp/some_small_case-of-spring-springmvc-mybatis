package com.zujian.dao.impl;

import com.zujian.dao.IUserDAO;
import com.zujian.domain.User;

public class UserDAOImpl implements IUserDAO {
    @Override
    public void saveUser(User user) {
//        int i=1/0;
        System.out.println("dao层执行了");
    }
}
