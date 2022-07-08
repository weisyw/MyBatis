package com.ww.test;

import com.ww.mybatis.mapper.DynamicSQLMapper;
import com.ww.mybatis.pojo.Emp;
import com.ww.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 15:15
 * @Description: This is description of class
 */
public class DynamicSQLTest {

    @Test
    public void getEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emp = mapper.getEmpByCondition(new Emp(null, "", null, null, null));
        System.out.println(emp);
    }

    @Test
    public void getEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = mapper.getEmpByChoose(new Emp(null, "", null, null, null));
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void deleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int rows = mapper.deleteMoreByArray(new Integer[]{6, 7, 8});
        System.out.println(rows);
    }

    @Test
    public void insertMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 12, "男","123@qq.com");
        Emp emp2 = new Emp(null, "a2", 13, "男","123@qq.com");
        Emp emp3 = new Emp(null, "a3", 14, "男","123@qq.com");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        int rows = mapper.insertMoreByList(list);
        System.out.println(rows);
    }
}
