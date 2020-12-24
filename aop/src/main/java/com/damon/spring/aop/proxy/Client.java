package com.damon.spring.aop.proxy;

public class Client {

    public static void main(String[] args) {
//        RentProxy proxy = new RentProxy(new Host());
//        proxy.rent();

        Host host = new Host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(host);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }

}
