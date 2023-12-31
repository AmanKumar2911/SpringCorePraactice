package com.SpringExpresssionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{22+11}")
    private int x;
    @Value("#{2+3+78+6+7}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;
    @Value("#{T(java.lang.Math).E}")
    private double E;
    @Value("#{T(java.lang.Math).PI}")
    private double pi;
    @Value("#{new java.lang.String('Aman Kumar')}")
    private String name;
    @Value("#{8-5<=3}")
    private boolean isActive;

    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double getE() {
        return E;
    }
    public void setE(double e) {
        E = e;
    }
    public double getPi() {
        return pi;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    @Override
    public String toString() {
        return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", pi=" + pi + ", name=" + name + ", isActive="
                + isActive + "]";
    }
    
    
    
}
