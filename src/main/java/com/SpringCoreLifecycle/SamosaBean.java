package com.SpringCoreLifecycle;

public class SamosaBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price value price = "+price);
        this.price = price;
    }
    

    public SamosaBean() {
    }

    @Override
    public String toString() {
        return "SamosaBean [price=" + price + "]";
    }


    public void init(){
        System.out.println("Inside init method");
        // this.price = 45.0;
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
    
    
}
