package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.example")
public class BeanConfig {

    // @Bean
    // public DoctorUsingConstructor doc (){
    //     DoctorUsingConstructor d = new DoctorUsingConstructor();
    //     d.docID = 45;
    //     return d;
    // }
    
}
