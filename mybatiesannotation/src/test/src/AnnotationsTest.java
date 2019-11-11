import com.mybatiesanno.dao.IUserDAO;
import com.mybatiesanno.pojo.User;
import com.mybatiesanno.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AnnotationsTest {

    /**
     * 查询用户
     */
    @Test
    public void findAllTest (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);

        List<User> all = iUserDAO.findAll();
        for (User user : all) {
            System.out.println("user->>"+user);
            System.out.println("account->>"+user.getAccount());
        }
    }

    /**
     * 保存用户
     */
    @Test
    public void saveUserTest (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setUuser_name("注解插入预备");
        user.setUuser_pwd("123456");
        iUserDAO.saveUser(user);
        sqlSession.commit();
    }

    /**
     * 修改用户
     */
    @Test
    public void updateUserTest (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setUid(3);
        user.setUuser_name("注解修改666");
        user.setUuser_pwd("88888");
        iUserDAO.updateUser(user);
        sqlSession.commit();
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUserTest (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        int id = 18;
        iUserDAO.deleteUser(id);
        sqlSession.commit();
    }
    /**
     * 模糊用户
     */
    @Test
    public void findUserByNameTest (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        String username = "%加%";
        List<User> userByName = iUserDAO.findUserByName(username);
        for (User user : userByName) {
            System.out.println("user->>"+userByName);
        }
    }

    /**
     * 根据id查询用户
     */
    @Test
    public void findByIdTest (){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        int id = 8;
        User byId = iUserDAO.findById(id);
        System.out.println("user->>"+byId);
    }


}
