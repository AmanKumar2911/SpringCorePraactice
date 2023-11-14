package com.Auto_wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireConfig.xml");
        Employee emp1 = context.getBean(Employee.class);
        System.out.println(emp1);
    }
}
