package com.spring.dao.impl;

import com.spring.dao.IUserDAO;
import com.spring.pojo.User;
import com.spring.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IUserDAOImpl implements IUserDAO {
    @Override
    /**
     * 查询所有
     */
    public List<User> findAll() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
        List<User> all = dao.findAll();
        for (User user : all) {
            System.out.println("user->>" + user);
        }
        return all;
    }

    @Override
    /**
     * 插入一条数据
     */
    public void saveUser(User user) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
        dao.saveUser(user);
    }

    @Override
    /**
     * 更新用户
     */
    public void updateUser(User user) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
    }

    @Override
    /**
     * 删除用户
     */
    public void deleteUser(int userid) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
        dao.deleteUser(userid);
    }

    @Override
    /**
     * 模糊查询
     */
    public List<User> findUserByName(String username) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
        List<User> userByName = dao.findUserByName(username);
        System.out.println("userByName->>" + username);
        return userByName;
    }
}
