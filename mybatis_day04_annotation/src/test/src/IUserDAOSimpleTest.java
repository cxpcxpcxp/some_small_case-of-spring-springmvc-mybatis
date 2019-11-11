import com.batisanno.dao.IUserDAO;
import com.batisanno.pojo.User;
import com.batisanno.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class IUserDAOSimpleTest {
    @Test
    public void findAllUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        List<User> allUser = userDAO.findAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
    }

    @Test
    public void findUserByIdTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        int id = 3;
        User userById = userDAO.findUserById(id);
        System.out.println(userById);
    }

    @Test
    public void findUserByNameTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        String username = "%加盐盐%";
        List<User> userByName = userDAO.findUserByName(username);
        for (User user : userByName) {
            System.out.println(user);
        }
    }

    @Test
    public void saveUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setUser_name("憨憨");
        user.setUser_pwd("56895");
        userDAO.saveUser(user);
        sqlSession.commit();
    }

    @Test
    public void deletUserTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        int id = 3;
        userDAO.deletUser(id);
        sqlSession.commit();
    }

    @Test
    public void One2OneTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        List<User> allofMultiOne2One = userDAO.findAllofMultiOne2One();
        for (User user : allofMultiOne2One) {
            System.out.println(user);
        }
    }

    @Test
    public void More2OneTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        List<User> one2One = userDAO.findAllofMultiMore2One();
        for (User user : one2One) {
            System.out.println(user);
        }
    }

    @Test
    public void More2MoreTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IUserDAO userDAO = sqlSession.getMapper(IUserDAO.class);
        List<User> allofMultiMore2More = userDAO.findAllofMultiMore2More();
        for (User user : allofMultiMore2More) {
            System.out.println(user);
        }
    }



}
