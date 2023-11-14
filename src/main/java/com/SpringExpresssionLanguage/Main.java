package com.SpringExpresssionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("SEL_config.xml");
        Demo demo = (Demo)context.getBean("demo");
        System.out.println(demo);
    }
}
