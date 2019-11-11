import com.batisanno.dao.IAccountDAO;
import com.batisanno.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class IAccountDAOTest {
    @Test
    public void deleteAccountTest(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IAccountDAO accountDAO = sqlSession.getMapper(IAccountDAO.class);
        int id = 2;//15把两个
        accountDAO.deleteAccountById(id);
        sqlSession.commit();
    }
}
