package com.pagehelper.dao;

import com.pagehelper.pojo.User;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from usertb")
    public List<User> findAll();

    /**
     * 根据用户id查询用户
     * @param uid
     * @return
     */
    public User findById(int uid);
}
