package com.damon.spring.ioc.pojo;

public class Hello {

    private String string;

    public Hello(String hello) {
        System.out.println("User constructor: " + hello);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "string='" + string + '\'' +
                '}';
    }
}
