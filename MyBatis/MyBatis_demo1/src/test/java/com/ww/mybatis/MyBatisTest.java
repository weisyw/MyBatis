package com.ww.mybatis;

import com.ww.mybatis.mapper.UserMapper;
import com.ww.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/4 21:23
 * @Description: This is description of class
 */
public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4。获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.测试功能
        int result = mapper.insertUser();
        System.out.println("受影响行数：" + result);
        // 7.提交事务
        // sqlSession.commit();
    }
    @Test
    public void testUpdate() throws IOException {
        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4。获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.测试功能
        int result = mapper.updateUser();
        System.out.println("受影响行数：" + result);
        // 7.提交事务
        // sqlSession.commit();
    }
    @Test
    public void testDelete() throws IOException {
        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4。获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.测试功能
        int result = mapper.deleteUser();
        System.out.println("受影响行数：" + result);
        // 7.提交事务
        // sqlSession.commit();
    }
    @Test
    public void testGetById() throws IOException {
        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4。获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.测试功能
        User result = mapper.getUserById();
        System.out.println("查询结果：" + result);
        // 7.提交事务
        // sqlSession.commit();
    }

    @Test
    public void testGetAllUser() throws IOException {
        // 1.加载核心配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4。获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.测试功能
        List<User> result = mapper.getAllUser();
        System.out.println("查询结果：" + result);
        // 7.提交事务
        // sqlSession.commit();
    }
}
