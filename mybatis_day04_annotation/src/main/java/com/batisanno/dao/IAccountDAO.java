package com.batisanno.dao;

import com.batisanno.pojo.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface IAccountDAO {
    @Delete("delete from account where id = #{accid}")
    public void deleteAccountById(int accid);

    @Select("select * from account where id = #{acid}")
    public Account findById(int acid);
}
