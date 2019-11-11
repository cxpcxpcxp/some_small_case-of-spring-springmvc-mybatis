import com.spring.dao.IUserDAO;
import com.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOC1Test {
    /////////////////////////////////////222222222222222222222/////////////////////////////////////////////////////////////////////
    @Test
    public void iUserDAOSelectTest2() {
//        获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/daoImpl/bean.xml");
        /*//        用对象来创建IUserDAO的代理对象
        IUserDAO iUserDAO = sqlSession.getMapper(IUserDAO.class);*/
//        根据id获取bean对象
        IUserDAO userDao = ac.getBean("UserDao", IUserDAO.class);//方法一
//        IUserDAO userDAO = (IUserDAO) ac.getBean("UserDAO");//方法二

        userDao.findAll();//相当于增强实现类
    }

    /**
     * 保存用户
     */
    @Test
    public void saveUserTest2() {
//        获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/daoimpl/bean.xml");
//        根据id获取bean对象
        IUserDAO userDao = ac.getBean("UserDao", IUserDAO.class);
        User user = new User();
        user.setUser_name("哇哈哈2");
        user.setUser_pwd("wahaha");
        userDao.saveUser(user);
    }

    /**
     * 更新用户
     */
    @Test
    public void updateUserTest2() {
//        获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/daoimpl/bean.xml");
//        根据id获取bean对象
        IUserDAO userDao = ac.getBean("UserDao", IUserDAO.class);
        User user = new User();
        user.setId(8);
        user.setUser_name("加盐盐2号");
        user.setUser_pwd("jyy22");
        userDao.updateUser(user);
    }

    /**
     * 删除
     */
    @Test
    public void deleteUserTest2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/daoimpl/bean.xml");
        IUserDAO userDao = ac.getBean("UserDao", IUserDAO.class);
        int id = 2;
        userDao.deleteUser(id);
    }

    /**
     * 模糊查询
     */
    @Test
    public void findUserByNameTest2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/spring/daoimpl/bean.xml");
        IUserDAO userDao = ac.getBean("UserDao", IUserDAO.class);
        String username = "%加盐盐%";
        userDao.findUserByName(username);
    }
}
