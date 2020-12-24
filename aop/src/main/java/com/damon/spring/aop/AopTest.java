package com.damon.spring.aop;

import com.damon.spring.aop.service.UserService;
import com.damon.spring.aop.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AopApplicationConfig.class);
//        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
//        userService.add();
    }

}
