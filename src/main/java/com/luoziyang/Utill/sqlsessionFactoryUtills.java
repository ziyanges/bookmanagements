package com.luoziyang.Utill;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author luoziyang
 * @create 2022-10-20
 */
 public class sqlsessionFactoryUtills {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        //随着类的加载只加载一次
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
          sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getsqlSessionFactory(){
        return sqlSessionFactory;
    }
}
