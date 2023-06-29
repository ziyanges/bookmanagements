import com.luoziyang.Mapper.BookMapper;
import com.luoziyang.Mapper.BorrowMapper;
import com.luoziyang.Utill.sqlsessionFactoryUtills;
import com.luoziyang.pojo.BorrowRecord;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

/**
 * @author luoziyang
 * @create 2022-12-29
 */
public class borrowtest {
    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BorrowMapper borrowMapper = sqlSession.getMapper(BorrowMapper.class);
        List<BorrowRecord> borrowRecords = borrowMapper.selectallByusername("123456");
        for (BorrowRecord borrowRecord : borrowRecords) {
            System.out.println(borrowRecord);
        }
    }
    @Test
    public void test2(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BorrowMapper borrowMapper = sqlSession.getMapper(BorrowMapper.class);
        borrowMapper.deleterecord("123456","123456");
        sqlSession.commit();

    }
    @Test
    public void test3(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BorrowMapper borrowMapper = sqlSession.getMapper(BorrowMapper.class);
        borrowMapper.updatetime("123456","456789",new Date(2022,12,18));
        sqlSession.commit();

    }


}
