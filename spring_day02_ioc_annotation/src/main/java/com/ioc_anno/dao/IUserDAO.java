package com.ioc_anno.dao;

import com.ioc_anno.domain.User;

import java.util.List;

public interface IUserDAO {
    List<User> findAll();
}
