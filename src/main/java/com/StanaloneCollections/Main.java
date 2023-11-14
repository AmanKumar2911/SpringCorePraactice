package com.StanaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionConfig.xml");
        Person p1 = (Person)context.getBean("p1");
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p1.getFeestructure().getClass().getName());
    }
}
