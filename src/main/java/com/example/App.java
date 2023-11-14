package com.example;

import javax.print.Doc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        // Doctor doc = context.getBean(Doctor.class);
        // Nurse nur = context.getBean(Nurse.class);
        // Nurse nur = (Nurse) context.getBean("nurse");
        // doc.assist();
        // nur.assist();


        // Staff staff = context.getBean(Doctor.class);
        // staff.assist();
        // Staff staff1 = context.getBean(Nurse.class);
        // staff1.assist();

        // Doctor doc = context.getBean(Doctor.class);
        // System.out.println(doc.getQualification());

        // Nurse nur= context.getBean(Nurse.class);
        // System.out.println(nur.getDoc().getQualification());

        // DoctorUsingConstructor d = (DoctorUsingConstructor) context.getBean("dconstructor");
        // System.err.println(d.docID);
        // System.err.println(d.docName);

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doc = context.getBean(Doctor.class);
        doc.assist();

        DoctorUsingConstructor d = context.getBean(DoctorUsingConstructor.class);
        System.out.println(d.docID);
        d.docID=89;
        System.out.println(d.docID);

        DoctorUsingConstructor d1 = context.getBean(DoctorUsingConstructor.class);
        System.out.println(d1.docID);

        
        
    }
}
