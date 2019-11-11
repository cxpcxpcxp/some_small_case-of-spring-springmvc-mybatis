package com.mybatis1.dao;

import com.mybatis1.pojo.User;

import java.util.List;

public interface IUserDAO {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param userid
     */
    void deleteUser(int userid);

    List<User> findUserByName(String username);
}
