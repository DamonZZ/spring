package com.damon.spring.aop.proxy;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("Want rcent house");
    }
}
