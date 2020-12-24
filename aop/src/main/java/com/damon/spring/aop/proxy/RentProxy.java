package com.damon.spring.aop.proxy;

public class RentProxy implements Rent {

    private Host host;

    public RentProxy() {

    }

    public RentProxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        this.seeHouse();
        this.host.rent();
        this.pay();
    }

    private void seeHouse() {
        System.out.println("See house");
    }

    private void pay() {
        System.out.println("Pay");
    }


}
