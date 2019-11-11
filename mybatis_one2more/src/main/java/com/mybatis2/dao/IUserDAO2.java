package com.mybatis2.dao;

import com.mybatis2.pojo.User;

import java.util.List;

public interface IUserDAO2 {
    /**
     * 查询所有
     * @return
     */
    public List<User> findAllandAccount();

    /**
     * 根据用户id查询用户
     * @param uid
     * @return
     */
    public User findById(int uid);
}
