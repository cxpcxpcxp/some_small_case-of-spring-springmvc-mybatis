package com.ioc_anno.dao.impl;

import com.ioc_anno.dao.IUserDAO;
import com.ioc_anno.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {

    @Autowired
    private JdbcTemplate template;
    @Override
    public List<User> findAll() {
        String sql = "select * from usertb";
        return template.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }
}
