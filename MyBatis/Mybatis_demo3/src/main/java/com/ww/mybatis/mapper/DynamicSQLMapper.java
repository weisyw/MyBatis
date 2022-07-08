package com.ww.mybatis.mapper;

import com.ww.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 15:07
 * @Description: This is description of class
 */
public interface DynamicSQLMapper {


    /**
     * 多条件查询
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 测试choose, when, otherwise
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     * @param eids
     * @return
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 通过list集合实现批量添加
     * @param emps
     * @return
     */
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
