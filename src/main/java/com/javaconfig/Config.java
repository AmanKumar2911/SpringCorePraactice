package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javaconfig")
public class Config {

    // @Bean
    // public  Samosa getSamosa(){
    //     return new Samosa();
    // }
    
    // @Bean(name = {"student","temp","con"})
    // public Student getStudent(){
    //     return new Student(67,getSamosa());
    // }
}
