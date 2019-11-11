package com.dao.iuserdao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pagehelper.dao.IUserDAO;
import com.pagehelper.pojo.User;
import com.pagehelper.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class IUserDAOTest {
    @Test
    public void findAllTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
        Page<User> page = PageHelper.startPage(1, 3);
        List<User> all = dao.findAll();
        for (User user : all) {
            System.out.println(user);
        }

    }
}
