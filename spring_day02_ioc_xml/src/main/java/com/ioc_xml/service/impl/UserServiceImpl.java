package com.ioc_xml.service.impl;

import com.ioc_xml.dao.IUserDAO;
import com.ioc_xml.domain.User;
import com.ioc_xml.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserDAO userDAO;

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(int uid) {
        return userDAO.findById(uid);
    }

    @Override
    public List<User> findUserByName(String username) {
        return userDAO.findUserByName(username);
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void deleteUser(int uid) {
        userDAO.deleteUser(uid);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
}
