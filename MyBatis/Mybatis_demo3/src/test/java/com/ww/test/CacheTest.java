package com.ww.test;

import com.ww.mybatis.mapper.CacheMapper;
import com.ww.mybatis.pojo.Emp;
import com.ww.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 17:30
 * @Description: This is description of class
 */
public class CacheTest {

    @Test
    public void getEmpByEid(){
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        System.out.println("---------------------------第一次执行---------------------------");
        Emp emp1 = mapper1.getEmpByEid(1);
        System.out.println(emp1);
        System.out.println("---------------------------第二次执行---------------------------");
//        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
//        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        mapper1.insertEmp(new Emp(null, "a1", 12, "男","123@qq.com"));
        Emp emp2 = mapper1.getEmpByEid(1);
        System.out.println(emp2);
    }

    @Test
    public void TwoCache(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
            CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
            System.out.println("---------------------------第一次执行---------------------------");
            System.out.println(mapper1.getEmpByEid(1));
            //sqlSession1.close();
            SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
            CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
            System.out.println("---------------------------第二次执行---------------------------");
            System.out.println(mapper2.getEmpByEid(1));
            //sqlSession2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
