package com.ww.mybatis_springboot.mapper;

import com.ww.mybatis_springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 21:47
 * @Description: This is description of class
 */
@Mapper
public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    User getById(Integer id);
}
