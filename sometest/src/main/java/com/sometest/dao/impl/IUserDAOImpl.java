package com.sometest.dao.impl;

import com.sometest.dao.IUserDAO;
import com.sometest.pojo.User;
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
        try {
//        加载主配置
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = build.openSession();
            List<User> list = sqlSession.selectList("com.sometest.dao.IUserDAO.findAll");
            for (Object o : list) {
                System.out.println("o-->"+o);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    /**
     * 插入一条数据
     */
    public void saveUser(User user) {
        try {
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = build.openSession();
            int insert = sqlSession.insert("com.sometest.dao.IUserDAO.saveUser", user);
            sqlSession.commit();
            System.out.println("insert->>"+insert);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("插入错误。。。");
        }
    }

    @Override
    /**
     * 更新用户
     */
    public void updateUser(User user) {
        try {
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = build.openSession();
            int update = sqlSession.update("com.sometest.dao.IUserDAO.updateUser", user);
            sqlSession.commit();
            System.out.println("update->>"+update);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("更新错误。。。");
        }
    }

    @Override
    /**
     * 删除用户
     */
    public void deleteUser(int userid) {
        try {
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = build.openSession();
            int delete = sqlSession.delete("com.sometest.dao.IUserDAO.deleteUser", userid);
            sqlSession.commit();
            System.out.println("delete->>"+delete);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("删除错误。。");
        }
    }

    @Override
    /**
     * 模糊查询
     */
    public List<User> findUserByName(String username) {
        try {
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = build.openSession();
            List<User> list = sqlSession.selectList("com.sometest.dao.IUserDAO.findUserByName", username);
            for (Object o : list) {
                System.out.println("o-->"+o);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }
    }
}
