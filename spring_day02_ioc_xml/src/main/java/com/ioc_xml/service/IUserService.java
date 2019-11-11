package com.ioc_xml.service;

import com.ioc_xml.domain.User;

import java.util.List;

public interface IUserService {
    /**
     * 查询所有
     * @return
     */
    public List<User> findAll();

    /**
     * 根据id查询用户
     */
    public User findById(int uid);

    /**
     * 模糊查询
     */
    public List<User> findUserByName(String username);

    /**
     * 保存用户
     */
    public void saveUser(User user);

    /**
     * 删除用户
     */
    public void deleteUser(int uid);

    /**
     * 修改用户
     */
    public void updateUser(User user);
}
