package com.StereoType;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoTypeConfig.xml");
        // Student stu = context.getBean(Student.class);
        Student stu = (Student) context.getBean("ob");
        ArrayList<String> list = new ArrayList<>();

        list.add("001");
        list.add("002");
        list.add("003");
        stu.setCode(list);

        System.out.println(stu.hashCode());

        Student stu1 = (Student) context.getBean("ob");
        System.out.println(stu1.hashCode());
        System.out.println(stu1.getCode());
        
    }
    
}
