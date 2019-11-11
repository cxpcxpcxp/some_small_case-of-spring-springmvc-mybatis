package com.mybatiesanno.dao;

import com.mybatiesanno.pojo.User;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IUserDAO {
    /**
     * 查询所有
     * @return
     * 一对多 查询多个账户，延迟加载
     */
    @Select("select * from usertb")
    @Results(id = "userMap",value = {
            @Result(id = true,column = "id",property = "uid"),
            @Result(column = "user_name",property = "uuser_name"),
            @Result(column = "user_pwd",property = "uuser_pwd"),
            @Result(property = "account",column = "id",many = @Many(select = "com.mybatiesanno.dao.IAccountDAO.findById",fetchType= FetchType.EAGER))
    })
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    @Insert("insert into usertb values(null,#{uuser_name},#{uuser_pwd})")
    @ResultMap(value = {"userMap"})
    void saveUser(User user);

    /**
     * 更新用户
     */
    @Update("update usertb set user_name=#{uuser_name},user_pwd=#{uuser_pwd} where id=#{uid}")
    @ResultMap(value = {"userMap"})
    void updateUser(User user);

    /**
     * 删除用户
     * @param userid
     */
    @Delete("delete from usertb where id=#{userid}")
    @ResultMap(value = {"userMap"})
    void deleteUser(int userid);

    /**
     * 模糊查询
     */
    @Select("select * from usertb where user_name like #{value}")
    @ResultMap(value = {"userMap"})
    List<User> findUserByName(String username);

    /**
     * 根据id查询
     *
     */
    @Select("select * from usertb where id=#{uid}")
    @ResultMap(value = {"userMap"})
    User findById(int id);



}
