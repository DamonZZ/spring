package com.damon.spring.aop.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserServiceImpl implements UserService {


    @PostConstruct
    public void init() {
        this.add();
    }

    @Override
    public void add() {
        System.out.println("add a user");
    }

    @Override
    public void delete() {
        System.out.println("delete a user");
    }

    @Override
    public void update() {
        System.out.println("update a user");
    }

    @Override
    public void select() {
        System.out.println("select a user");
    }

    @Override
    public String toString() {
        return "UserServiceImpl{}";
    }
}
