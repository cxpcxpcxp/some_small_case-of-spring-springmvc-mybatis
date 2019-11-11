import com.batisanno.dao.IRoleAndUserRelationDAO;
import com.batisanno.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class IRoleAndUserRelationDAOTest {
    @Test
    public void deleteById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        IRoleAndUserRelationDAO dao = sqlSession.getMapper(IRoleAndUserRelationDAO.class);
        int id = 3;
        dao.deleteById(id);
        sqlSession.commit();
    }

    @Test
    public void findAllofMultiOne2OneTest(){

    }
}
