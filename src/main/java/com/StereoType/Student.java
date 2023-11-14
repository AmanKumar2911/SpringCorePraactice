package com.StereoType;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {

    @Value("Aman Kumar")
    private String stu_name;

    @Value("Delhi")
    private String city;
    
    private List<String> code; 
    
    public String getStu_name() {
        return stu_name;
    }
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public List<String> getCode() {
        return code;
    }
    public void setCode(List<String> code) {
        this.code = code;
    }
    @Override
    public String toString() {
        return "Student [stu_name=" + stu_name + ", city=" + city + ", code=" + code + "]";
    }
    

    

}
