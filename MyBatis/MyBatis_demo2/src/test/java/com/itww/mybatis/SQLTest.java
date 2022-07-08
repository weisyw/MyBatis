package com.itww.mybatis;

import com.itww.mybatis.mapper.SQLMapper;
import com.itww.mybatis.pojo.User;
import com.itww.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/6 23:05
 * @Description: This is description of class
 */
public class SQLTest {

    @Test
    public void getUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        System.out.println(list);
    }

    @Test
    public void deleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int result = mapper.deleteMore("1,2,6");
        System.out.println(result);
    }

    @Test
    public void getUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByTableName("t_user");
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "王五", "1234", 18, "男" , "123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
