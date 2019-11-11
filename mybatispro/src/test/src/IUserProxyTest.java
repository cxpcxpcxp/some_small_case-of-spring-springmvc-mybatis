import com.mybatis1.dao.IUserDAO;
import com.mybatis1.pojo.User;
import com.mybatis1.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class IUserProxyTest {
    /**
     * 查询所有
     */
    @Test
    public void iUserDAOSelectTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        List<User> all = userDAO.findAll();
        for (User user : all) {
            System.out.println("user->>"+user);
        }
    }
    /**
     * 保存用户
     */
    @Test
    public void saveUserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO proxyDAO = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setUser_name("光头强");
        user.setUser_pwd("guangtouqiang");
        proxyDAO.saveUser(user);
        sqlSession.commit();
    }

    /**
     * 更新用户
     */
    @Test
    public void updateUserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO proxyDAO = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setId(3);
        user.setUser_name("王五五");
        user.setUser_pwd("www");
        proxyDAO.updateUser(user);
        sqlSession.commit();
    }

    /**
     * 删除
     */
    @Test
    public void deleteUserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO proxyDAO = sqlSession.getMapper(IUserDAO.class);
        proxyDAO.deleteUser(4);
        sqlSession.commit();
    }

    /**
     * 模糊查询
     */
    @Test
    public void findUserByNameTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDAO proxyDAO = sqlSession.getMapper(IUserDAO.class);
        String username = "%加%";
        List<User> userByName = proxyDAO.findUserByName(username);
        for (User user : userByName) {
            System.out.println("user->>"+user);
        }
    }
}
