package com.batisanno.dao;

import com.batisanno.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IUserDAO {
    @Select("select * from usertb")
    public List<User> findAllUser();

    @Select("select * from usertb where id=#{uid}")
    public User findUserById(int uid);

    @Select("select * from usertb where user_name like #{value}")
    public List<User> findUserByName(String uname);

    @Insert("insert into usertb values (null,#{user_name},#{user_pwd})")
    public void saveUser(User user);

    @Delete("delete from usertb where id=#{id}")
    public void deletUser(int uid);
    public void updateUser(User user);

//    多表查询
    @Select("select usertb.* ,c.id cid,c.uid,c.cardNum from usertb left join cardtb c on usertb.id = c.uid")
    @Results(
            id="userMap1" ,value = {
            @Result(id = true ,column = "id",property = "id"),
            @Result(column = "user_name",property = "user_name"),
            @Result(column = "user_pwd",property = "user_pwd"),
            @Result(property = "card",column = "cid",
                    one=@One(select = "com.batisanno.dao.ICardDAO.findById",
                            fetchType = FetchType.EAGER))

    }
    )
    public List<User> findAllofMultiOne2One();

    @Select("select usertb.* ,a.id aid,a.uid,a.money from usertb LEFT JOIN account a on usertb.id = a.uid")
    @Results(
            id="userMap2" ,value = {
            @Result(id = true ,column = "id",property = "id"),
            @Result(column = "user_name",property = "user_name"),
            @Result(column = "user_pwd",property = "user_pwd"),
            @Result(property = "account",column = "aid" ,
                    one = @One(select = "com.batisanno.dao.IAccountDAO.findById",
                            fetchType = FetchType.EAGER))
    }
    )
    public List<User> findAllofMultiMore2One();

    @Select("")
    public List<User> findAllofMultiOne2More();

    @Select("select usertb.* ,u.id uid,u.uid, u.rid,r.id rrid,r.rolename from usertb\n" +
            "left join usertbrole u on usertb.id = u.uid\n" +
            "left join roletb r on u.rid = r.id")
    @Results(
            id = "userMap3",value = {
            @Result(id = true ,column = "id",property = "id"),
            @Result(column = "user_name",property = "user_name"),
            @Result(column = "user_pwd",property = "user_pwd"),
            @Result(property = "relationList",column = "uid",
                    many = @Many(select = "com.batisanno.dao.IRoleAndUserRelationDAO.findById",
                    fetchType = FetchType.LAZY)),
            @Result(property = "roleList",column = "rrid",
                    many = @Many(select = "com.batisanno.dao.IRoleDAO.findById",
                            fetchType = FetchType.LAZY))
    })
    public List<User> findAllofMultiMore2More();

}
