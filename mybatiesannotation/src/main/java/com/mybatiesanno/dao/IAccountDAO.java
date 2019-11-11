package com.mybatiesanno.dao;

import com.mybatiesanno.pojo.Account;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IAccountDAO {
    /**
     * 查询所有(一对一) 立即加载
     * @return
     */
    @Select("select * from account")
    @Results(id = "accountMap" ,value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "money",property = "money"),
            @Result(property = "user",column = "uid",one=@One   ( select="com.mybatiesanno.dao.IUserDAO.findById",fetchType= FetchType.EAGER))
    })
    List<Account> findAll();
    /**
     * 根据id查询
     */
    @Select("select * from account where id=#{id}")
    Account findById(int id);
}
