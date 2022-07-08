package com.ww.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ww.mybatis.bean.Emp;
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
 * @DateTime: 2022/7/8 20:44
 * @Description: This is description of class
 */
public class PageHelperTest {

    @Test
    public void testPageHelper(){
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSession sqlSession = new SqlSessionFactoryBuilder().build(is).openSession(true);
            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            //PageHelper.startPage(1,4);
            PageHelper.startPage(1,2);
            List<Emp> list = mapper.selectByExample(null);
            PageInfo<Emp> page = new PageInfo<>(list, 3);
            System.out.println(page);
            //list.forEach(emp -> System.out.println(emp));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
