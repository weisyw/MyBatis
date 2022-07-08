package com.ww.mybatis.mapper;

import com.ww.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: ww
 * @DateTime: 2022/7/7 19:29
 * @Description: This is description of class
 */
public interface DeptMapper {
    /**
     * 通过分步查询查询员工以及员工所对应的部门信息
     * 分步查询第二步：通过did查询员工所对应的部门
     * @param did
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);

    /**
     * 获取部门以及部门中所有的员工的信息
     * @param did
     * @return
     */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
     * 通过分步查询部门以及部门中的所有员工信息
     * 分步查询第一步：查询部门信息
     * @param id
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("did") Integer id);
}
