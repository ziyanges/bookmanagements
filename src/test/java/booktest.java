import com.luoziyang.Mapper.BookMapper;
import com.luoziyang.Mapper.UserMapper;
import com.luoziyang.Utill.sqlsessionFactoryUtills;
import com.luoziyang.pojo.book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author luoziyang
 * @create 2022-12-28
 */
public class booktest {
    //测试按照书名搜索
    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<book> books = bookMapper.selectbybookname("语文");
        for (book book : books) {
            System.out.println(book);
        }
    }
    //测试按照ISBN进行搜索
    @Test
    public void test5(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        book book = bookMapper.selectbyISBN("9781234567891");
        System.out.println(book);
    }
    //图书管理员对图书进行添加操作
    @Test
    public void test2(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        bookMapper.addbook("123456789","张明","古代全书",2);
        sqlSession.commit();
    }
    //图书管理员对图书进行删除操作
    @Test
    public void test3(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        bookMapper.deletebook("123456789");
        sqlSession.commit();
    }
    //对图书库存进行修改
    @Test
    public void test4(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        bookMapper.updateReserve(0,"123456");
        sqlSession.commit();
    }

}
