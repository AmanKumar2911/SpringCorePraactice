package com.SpringCoreLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsibean implements InitializingBean , DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public pepsibean() {
    }

    @Override
    public String toString() {
        return "pepsibean [price=" + price + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //init method
        System.out.println("taking pepsi in: init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Going to put back to show after drinking :destroy");
    }

    
}
