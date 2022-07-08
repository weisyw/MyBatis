package com.itww.mybatis;

import com.itww.mybatis.mapper.ParameterMapper;
import com.itww.mybatis.pojo.User;
import com.itww.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ww
 * @DateTime: 2022/7/5 21:39
 * @Description: This is description of class
 */
public class test {

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> userList = mapper.getAllUser();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void GetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("张三");
        System.out.println(user);
    }

    @Test
    public void checkLogin(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("张三","1234");
        System.out.println(user);
    }

    @Test
    public void checkLoginByMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "1234");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void insertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User(null, "王五", "1234", 18, "男" , "123@qq.com");
        int rows = mapper.insertUser(user);
        System.out.println(rows);
    }

    @Test
    public void checkLoginByParam(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("张三", "1234");
        System.out.println(user);
    }



}
