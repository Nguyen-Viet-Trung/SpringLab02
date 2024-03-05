package com.vn.devmaster.service.Lab02;

import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Person{
    @Override
    public void wear(){
        System.out.println("Học sinh phải mặc đồng phục");
    }

    @Override
    public void work() {
        System.out.println("Học sinh phải tới trường");
    }
}
