package com.ioc_xml.dao;

import com.ioc_xml.domain.User;

import java.util.List;

public interface IUserDAO {
    void updateUser(User user);

    void deleteUser(int uid);

    void saveUser(User user);

    List<User> findUserByName(String username);

    User findById(int uid);

    List<User> findAll();
}
