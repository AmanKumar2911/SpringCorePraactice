package com.ConstructorExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("newconfig.xml");
        Addition add = context.getBean(Addition.class);
        add.doSum();
    }
}
