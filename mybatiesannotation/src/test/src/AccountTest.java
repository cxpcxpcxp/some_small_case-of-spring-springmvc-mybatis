import com.mybatiesanno.dao.IAccountDAO;
import com.mybatiesanno.pojo.Account;
import com.mybatiesanno.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AccountTest {
    @Test
    public void findAllTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IAccountDAO dao = sqlSession.getMapper(IAccountDAO.class);
        List<Account> accounts = dao.findAll();
        for (Account account : accounts) {
            System.out.println("acount->>"+account);
            System.out.println("user->>"+account.getUser());
        }
    }

    @Test
    public void findByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IAccountDAO dao = sqlSession.getMapper(IAccountDAO.class);
        int id = 3;
        Account byId = dao.findById(id);
        System.out.println("account->>"+byId);
    }
}
