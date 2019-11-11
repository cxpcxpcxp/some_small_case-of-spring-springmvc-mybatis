package com.ioc_xml.dao.impl;

import com.ioc_xml.dao.IUserDAO;
import com.ioc_xml.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserDAOImpl implements IUserDAO {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void updateUser(User user) {
        String sql = "update usertb set user_name=?,user_pwd=? where id=?";
        template.update(sql,user.getUser_name(),user.getUser_pwd(),user.getId());
    }

    @Override
    public void deleteUser(int uid) {
        String sql = "delete from usertb where id=?";
        template.update(sql,uid);
    }

    @Override
    public void saveUser(User user) {
        String sql = "insert into usertb values(null,?,?)";
        template.update(sql,user.getUser_name(),user.getUser_pwd());
    }

    @Override
    public List<User> findUserByName(String username) {
        String sql = "select * from usertb where user_name like ?";
        return template.query(sql,new BeanPropertyRowMapper<User>(User.class),username);
    }

    @Override
    public User findById(int uid) {
        String sql = "select * from usertb where id = ?";
        return template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),uid);
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from usertb";
        return template.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }
}
