import com.sometest.dao.IUserDAO;
import com.sometest.dao.IUserProxyDAO;
import com.sometest.dao.impl.IUserDAOImpl;
import com.sometest.pojo.User;
import com.sometest.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class IUserProxyTest {
    /**
     * 查询所有
     */
    @Test
    public void iUserDAOSelectTest() {
        IUserProxyDAO proxyDAO = MyBatisUtils.getDAO(IUserProxyDAO.class);
        List<User> all = proxyDAO.findAll();
        for (User user : all) {
            System.out.println("user->>"+user);
        }
    }
    /**
     * 保存用户
     */
    @Test
    public void saveUserTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserProxyDAO proxyDAO = sqlSession.getMapper(IUserProxyDAO.class);
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
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserProxyDAO proxyDAO = sqlSession.getMapper(IUserProxyDAO.class);
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
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserProxyDAO proxyDAO = sqlSession.getMapper(IUserProxyDAO.class);
        proxyDAO.deleteUser(4);
        sqlSession.commit();
    }

    /**
     * 模糊查询
     */
    @Test
    public void findUserByNameTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserProxyDAO proxyDAO = sqlSession.getMapper(IUserProxyDAO.class);
        String username = "%加%";
        List<User> userByName = proxyDAO.findUserByName(username);
        for (User user : userByName) {
            System.out.println("user->>"+user);
        }
    }
}
