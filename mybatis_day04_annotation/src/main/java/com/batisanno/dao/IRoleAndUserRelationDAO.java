package com.batisanno.dao;

import com.batisanno.pojo.RoleAndUserRelation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface IRoleAndUserRelationDAO {
    @Delete("delete from usertbrole where id = #{irid}")
    public void deleteById(int irid);

    @Select("select * from usertbrole where id = #{rrid}")
    public RoleAndUserRelation findById (int rrid);
}
