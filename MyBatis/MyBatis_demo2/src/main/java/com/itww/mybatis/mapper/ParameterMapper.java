package com.itww.mybatis.mapper;

import com.itww.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: ww
 * @DateTime: 2022/7/5 21:34
 * @Description: This is description of class
 */
public interface ParameterMapper {

    List<User> getAllUser();

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录，参数为map
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);


    /**
     * 添加用户
     * @param user
     * @return
     */
    int insertUser(User user);


    /**
     * 验证登录，使用@Param
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
