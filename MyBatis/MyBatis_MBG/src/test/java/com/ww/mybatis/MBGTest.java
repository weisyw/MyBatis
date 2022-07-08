package com.ww.mybatis;

import com.ww.mybatis.bean.Emp;
import com.ww.mybatis.bean.EmpExample;
import com.ww.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 20:29
 * @Description: This is description of class
 */
public class MBGTest {

    @Test
    public void testMBG(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            // 查询所有数据
            /*List<Emp> emps = mapper.selectByExample(null);
            emps.forEach(emp -> System.out.println(emp));*/
            // 根据条件查询
            EmpExample example = new EmpExample();
            example.createCriteria().andEmpNameEqualTo("张三");
            List<Emp> emps = mapper.selectByExample(example);
            emps.forEach(emp -> System.out.println(emp));
            // 根据主键修改
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
