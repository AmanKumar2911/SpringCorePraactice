package com.SpringCoreLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ForLifeCycleConfig.xml");
        //registring shutdown hook
        context.registerShutdownHook();

        SamosaBean s1 = (SamosaBean) context.getBean("s1");
        System.out.println(s1);
        

        System.out.println("----------------------------------------");

        pepsibean p1 =(pepsibean)context.getBean("p1");
        System.out.println(p1);

        System.out.println("----------------------------------------");

        jalebi j1 = (jalebi)context.getBean("j1");
        System.out.println(j1);

    }
}
