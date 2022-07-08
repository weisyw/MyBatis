package com.ww.mapper;

import com.ww.pojo.User;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 21:11
 * @Description: This is description of class
 */
public interface UserMapper {

    @Select("select * from t_user where id = #{id} ")
    User findById(Integer id);
}
