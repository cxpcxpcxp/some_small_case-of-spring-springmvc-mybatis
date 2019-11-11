package com.ssm.dao;

import com.ssm.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDAO {
    @Select("select * from usertb")
    public List<User> findAll();

    @Insert("insert into usertb values(null,#{user_name},#{user_pwd})")
    public void saveUser(User user);
}
