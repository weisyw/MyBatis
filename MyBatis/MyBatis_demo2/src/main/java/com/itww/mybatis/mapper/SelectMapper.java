package com.itww.mybatis.mapper;

import com.itww.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: ww
 * @DateTime: 2022/7/6 22:28
 * @Description: This is description of class
 */
public interface SelectMapper {


    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getUserList();

    /**
     * 查询用户的总记录数
     * @return
     * 在MyBatis中，对于Java中常用的类型都设置了类型别名
     * 例如：java.lang.Integer-->int|integer
     * 例如：int-->_int|_integer
     * 例如：Map-->map,List-->list
     */
    int getCount();

    /**
     * 根据用户id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String, Object> getUserToMap(@Param("id") int id);

    /**
     * 查询所有用户信息为map集合
     * @return
     */
    //List<Map<String, Object>> getAllUserToMap();
    @MapKey("id")
    Map<String, Object> getAllUserToMap();

}
