package com.ww.mybatis.mapper;

import com.ww.mybatis.pojo.User;

import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/4 21:10
 * @Description: This is description of class
 */
public interface UserMapper {

    /**
     * MyBatis面向接口编程的两个一致：
     * 1.映射文件的namespace要和mapper接口的全类名保持一致
     * 2.映射文件中的SQL语句的id要和mapper接口中的方法一致
     */


    /**
     * 添加用户
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return
     */
    int updateUser();

    /**
     * 删除用户信息
     * @return
     */
    int deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();
}

