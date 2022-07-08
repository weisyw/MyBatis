package com.itww.mybatis.mapper;

import com.itww.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/6 23:05
 * @Description: This is description of class
 */
public interface SQLMapper {
    /**
     * 根据用户名模糊查询用户信息
     * @param username
     * @return
     */
    List<User> getUserByLike(@Param("username") String username);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 查询指定表中的数据
     * @param tableName
     * @return
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);


    /**
     * 添加用户信息
     * @param user
     * @return
     */
    void insertUser(User user);


}
