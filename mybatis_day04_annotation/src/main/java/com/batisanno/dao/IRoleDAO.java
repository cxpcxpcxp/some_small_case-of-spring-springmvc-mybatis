package com.batisanno.dao;

import com.batisanno.pojo.Role;
import org.apache.ibatis.annotations.Select;

public interface IRoleDAO {
    @Select("select * from roletb where id = #{rid}")
    public Role findById(int rid);
}
