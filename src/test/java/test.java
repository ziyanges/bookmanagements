import com.luoziyang.Mapper.UserMapper;
import com.luoziyang.Utill.sqlsessionFactoryUtills;
import com.luoziyang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author luoziyang
 * @create 2022-12-28
 */
public class test {
    //测试用户名和密码是否可以正常查询
    @Test
    public void test1(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectbylogin("123", "123");
        System.out.println(user.toString());
    }
    //测试系统管理员权限添加账号
    @Test
    public void test2(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addpeople("李华","123456","借阅者");
        sqlSession.commit();
    }
    //测试系统管理员权限删除账号
    @Test
    public void test3(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deletepeople("123");
        sqlSession.commit();
    }
    //测试修改密码
    @Test
    public void test4(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updatepassword("李华","123456789");
        sqlSession.commit();
    }
    @Test
    public void test5(){
        SqlSessionFactory sqlSessionFactory = sqlsessionFactoryUtills.getsqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectpeople("借阅者");
        for (User user : users) {
            System.out.println(user);
        }
    }


}
