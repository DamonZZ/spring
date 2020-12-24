package com.damon.spring.ioc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Hello {

    private String string;

    //    @Autowired
//    @Qualifier(value = "dog")
    @Resource
    private Dog dog;

    public Hello(String hello) {
        System.out.println("User constructor: " + hello);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                ", dog=" + dog +
                '}';
    }
}
