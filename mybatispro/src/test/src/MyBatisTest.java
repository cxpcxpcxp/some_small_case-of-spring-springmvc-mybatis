import com.mybatis1.dao.IUserDAO;
import com.mybatis1.pojo.User;
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

public class MyBatisTest {
    InputStream resource = null;
    SqlSessionFactoryBuilder builder = null;
    SqlSessionFactory factory = null;
    SqlSession sqlSession = null;
    @Before
    public void init(){
        //        获取主配置文件
        try {
            resource = Resources.getResourceAsStream("SqlMapperConfig1.xml");
//        获取工厂对象
            builder = new SqlSessionFactoryBuilder();
            factory = builder.build(resource);
//        用工厂对象生成sqlsession对象
            sqlSession = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void close(){
        try {
            sqlSession.commit();
            //        关闭资源
            sqlSession.close();
            resource.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询用户
     */
    @Test
    public void findAllTest (){
//        用对象来创建IUserDAO的代理对象
            IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
//        使用代理对象执行方法
            List<User> all = iUserDAO.findAll();
            for (User user : all) {
                System.out.println("user->>"+user);
            }
    }

    /**
     * 保存用户
     */
    @Test
    public void saveUserTest(){
        User user = new User();
        user.setUser_name("小猪佩奇");
        user.setUser_pwd("123456");
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        iUserDAO.saveUser(user);
    }

    /**
     * 更新用户
     */
    @Test
    public void updateUserTest(){
        User user = new User();
        user.setId(3);
        user.setUser_name("王五");
        user.setUser_pwd("522");
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        iUserDAO.updateUser(user);
    }

    /**
     * 删除用户
     */
    @Test
    public void deleteUserTest(){
        User user = new User();
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);
        iUserDAO.deleteUser(6);
    }
}
