package com.mybatis5.dao;

import com.mybatis5.pojo.User;

import java.util.List;

public interface IUserDAO {
    /**
     * 查询所有
     * @return
     */
    public List<User> findAll();

    /**
     * 根据用户id查询用户
     * @param uid
     * @return
     */
    public User findById(int uid);
}
