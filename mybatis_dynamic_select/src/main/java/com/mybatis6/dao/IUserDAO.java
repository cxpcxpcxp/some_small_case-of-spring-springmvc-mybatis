package com.mybatis6.dao;

import com.mybatis6.pojo.User;
import com.mybatis6.pojo.UserIdVo;

import java.util.List;

public interface IUserDAO {
    public List<User> findAll();
    public List<User> findById(UserIdVo vo);
}
