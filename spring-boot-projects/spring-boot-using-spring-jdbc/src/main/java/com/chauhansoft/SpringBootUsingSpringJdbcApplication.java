package com.chauhansoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.chauhansoft")
public class SpringBootUsingSpringJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUsingSpringJdbcApplication.class, args);
    }

}
