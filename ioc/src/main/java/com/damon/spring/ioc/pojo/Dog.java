package com.damon.spring.ioc.pojo;

public class Dog {

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    private String eat;

    @Override
    public String toString() {
        return "Dog{" +
                "eat='" + eat + '\'' +
                '}';
    }
}
