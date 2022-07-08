package com.ww.mybatis_springboot;

import com.ww.mybatis_springboot.mapper.UserMapper;
import com.ww.mybatis_springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisSpringBootApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testGetById() {
        User user = userMapper.getById(3);
        System.out.println(user);
    }

}
