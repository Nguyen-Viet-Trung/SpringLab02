package com.vn.devmaster.service.Lab02;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee implements Person{
    @Override
    public void work(){
        System.out.println("Employee have to work");
    }
    public void wear(){
        System.out.println("Employee wears suit");
    }
}
