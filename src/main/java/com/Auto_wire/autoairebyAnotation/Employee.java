package com.Auto_wire.autoairebyAnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    private String emp_name;
    @Autowired
    private Address address;
    
    @Override
    public String toString() {
        return "Employee [emp_name=" + emp_name + ", address=" + address + "]";
    }
    public Employee() {
    }
    public Employee(String emp_name, Address address) {
        this.emp_name = emp_name;
        this.address = address;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    

}
