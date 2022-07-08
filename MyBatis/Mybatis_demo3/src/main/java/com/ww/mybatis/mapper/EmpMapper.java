package com.ww.mybatis.mapper;

import com.ww.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/7 19:29
 * @Description: This is description of class
 */
public interface EmpMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工以及员工所对应的部门信息
     * @param eid
     * @return
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);


    /**
     * 通过分步查询查询员工以及员工所对应的部门信息
     * 分步查询第一步：查询员工信息
     * @param eid
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);

    /**
     * 根据部门id查询员工信息
     * @param did
     * @return
     */
    List<Emp> getEmpListByDid(@Param("did") int did);
}
