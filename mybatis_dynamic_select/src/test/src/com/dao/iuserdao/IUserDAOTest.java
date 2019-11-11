package com.dao.iuserdao;

import com.mybatis6.dao.IUserDAO;
import com.mybatis6.pojo.User;
import com.mybatis6.pojo.UserIdVo;
import com.mybatis6.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class IUserDAOTest {
    @Test
    public void findAllTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO dao = sqlSession.getMapper(IUserDAO.class);
        List<Integer> list=new ArrayList<>();
        UserIdVo vo = new UserIdVo();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        vo.setIdlist(list);
        List<User> byId = dao.findById(vo);
        for (User user : byId) {
            System.out.println(user);
        }

    }
}
