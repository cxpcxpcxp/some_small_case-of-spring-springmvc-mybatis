package com.ioc_anno.service.impl;

import com.ioc_anno.dao.IUserDAO;
import com.ioc_anno.domain.User;
import com.ioc_anno.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO userDAO;
    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
