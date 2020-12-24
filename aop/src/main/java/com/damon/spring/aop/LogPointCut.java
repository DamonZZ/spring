package com.damon.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogPointCut {

    @Before("execution(* com.damon.spring.aop.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("=======Before=======");
    }

    @After("execution(* com.damon.spring.aop.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("=======After=======");
    }

}
