import com.sometest.dao.IUserDAO;
import com.sometest.dao.impl.IUserDAOImpl;
import com.sometest.pojo.User;
import org.junit.Test;

import java.util.List;

public class SelectTest {
    /**
     * 查询所有
     */
    @Test
    public void iUserDAOSelectTest() {
        IUserDAO dao = new IUserDAOImpl();
        List<User> list = dao.findAll();
    }
    /**
     * 保存用户
     */
    @Test
    public void saveUserTest() {
        IUserDAO dao = new IUserDAOImpl();
        User user = new User();
        user.setUser_name("傻逼一号");
        user.setUser_pwd("77895");
        dao.saveUser(user);
    }

    /**
     * 更新用户
     */
    @Test
    public void updateUserTest() {
        IUserDAO dao = new IUserDAOImpl();
        User user = new User();
        user.setId(9);
        user.setUser_name("小猪佩奇一号");
        user.setUser_pwd("88888");
        dao.updateUser(user);
    }

    /**
     * 删除
     */
    @Test
    public void deleteUserTest() {
        IUserDAO dao = new IUserDAOImpl();
        int id = 10;
        dao.deleteUser(id);
    }

    /**
     * 模糊查询
     */
    @Test
    public void findUserByNameTest() {
        IUserDAO dao = new IUserDAOImpl();
        String username = "%一号%";
        dao.findUserByName(username);
    }

}
