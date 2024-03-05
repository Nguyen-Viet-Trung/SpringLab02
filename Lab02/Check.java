package com.vn.devmaster.service.Lab02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Check {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Check.class, args);
        Company company = context.getBean(Company.class);
        School school = context.getBean(School.class);
        company.getPerson().work();
        school.getPerson().work();
    }
}
