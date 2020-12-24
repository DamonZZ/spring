package com.damon.spring.ioc;

import com.damon.spring.ioc.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

}
