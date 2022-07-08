package com.ww.mybatis.mapper;

import com.ww.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 17:28
 * @Description: This is description of class
 */
public interface CacheMapper {

    Emp getEmpByEid(@Param("eid") Integer eid);

    void insertEmp(Emp emp);
}
