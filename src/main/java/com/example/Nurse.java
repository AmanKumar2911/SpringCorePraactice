package com.example;

public class Nurse implements Staff {
    private Doctor doc;
    public void assist(){
        System.out.println("Nurse is assisting");
    }
    public Doctor getDoc() {
        return doc;
    }
    public void setDoc(Doctor doc) {
        this.doc = doc;
    }
    
}
