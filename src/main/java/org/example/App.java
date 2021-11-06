package org.example;

import org.example.config.SpringConfig;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Date;

/**
 * @author 85217
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService bean = applicationContext.getBean(UserService.class);
        User user = new User();
        user.setName("王腾");
        user.setPassword("123456");
        user.setSex("man");
        user.setAge(17);
        user.setEmail("XuBaiPiao@gmail.com");
        user.setPhone("18888886666");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        bean.save(user);
    }
}
