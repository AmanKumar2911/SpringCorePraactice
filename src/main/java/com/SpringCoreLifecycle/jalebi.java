package com.SpringCoreLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class jalebi {
    private int priceJalebi;

    public int getPriceJalebi() {
        return priceJalebi;
    }

    public void setPriceJalebi(int priceJalebi) {
        this.priceJalebi = priceJalebi;
    }

    public jalebi() {
    }

    @Override
    public String toString() {
        return "jalebi [priceJalebi=" + priceJalebi + "]";
    }
    
    @PostConstruct
    public void init(){
        System.out.println("init method of jalebi is called");
    }
    @PreDestroy
    public void distroy(){
        System.out.println("destroy method of jalebi is called");
    }
}
