package com.ssm.service;

import com.ssm.pojo.User;

import java.util.List;

public interface IUserService {
    public List<User> findAll();
    public void saveUser(User user);
}
