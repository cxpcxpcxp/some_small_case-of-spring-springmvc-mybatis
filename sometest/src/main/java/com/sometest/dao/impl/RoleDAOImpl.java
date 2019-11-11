package com.sometest.dao.impl;

import com.sometest.dao.IRoleDAO;
import com.sometest.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("roleDAO")
public class RoleDAOImpl implements IRoleDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Role> findAll() {
        String sql = "select * from roletb";
        return template.query(sql,new BeanPropertyRowMapper<Role>(Role.class));
    }
}
