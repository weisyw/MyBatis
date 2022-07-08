package com.ww;

import com.ww.Config.SpringConfig;
import com.ww.pojo.User;
import com.ww.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: ww
 * @DateTime: 2022/7/8 21:14
 * @Description: This is description of class
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = context.getBean(UserService.class);
        User user = bean.findById(3);
        System.out.println(user);
    }
}
