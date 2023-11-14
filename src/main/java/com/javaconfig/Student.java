package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("45")
    private int num;

    @Autowired 
    private Samosa eat;
    

    public Student() {
    }

    public Student(int num, Samosa eat) {
        this.num = num;
        this.eat = eat;
    }

    public void study(){
        eat.display();
        System.out.println("student is reading book");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public Samosa getEat() {
        return eat;
    }

    public void setEat(Samosa eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Student [num=" + num + ", eat=" + eat + "]";
    }

    
    
    
}
