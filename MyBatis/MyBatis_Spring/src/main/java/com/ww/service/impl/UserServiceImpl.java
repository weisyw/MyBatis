package com.ww.service.impl;

import com.ww.mapper.UserMapper;
import com.ww.pojo.User;
import com.ww.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 21:13
 * @Description: This is description of class
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
