package com.itww.mybatis;

import com.itww.mybatis.mapper.SelectMapper;
import com.itww.mybatis.pojo.User;
import com.itww.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Author: ww
 * @DateTime: 2022/7/6 22:30
 * @Description: This is description of class
 */
public class SelectTest {

    @Test
    public void getUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(3);
        System.out.println(user);
    }

    @Test
    public void getUserList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> userList = mapper.getUserList();
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void getCount(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        int count = mapper.getCount();
        System.out.println("总记录数为：" + count);
    }

    @Test
    public void getUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userToMap = mapper.getUserToMap(3);
        System.out.println(userToMap);
    }

    @Test
    public void getAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> allUserToMap = mapper.getAllUserToMap();
        System.out.println(allUserToMap);
    }
}
