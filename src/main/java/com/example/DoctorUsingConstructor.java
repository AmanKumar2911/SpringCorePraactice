package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class DoctorUsingConstructor implements BeanNameAware {
    public String docName;
    public int docID;

    public DoctorUsingConstructor(String docName, int docID) {
        this.docName = docName;
        this.docID = docID;
    }

    public DoctorUsingConstructor(){
        
    }

    @Override
    public void setBeanName(String name) {
       System.out.println("bean name is diclared");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("post construct Method is called");
    }
    
}
