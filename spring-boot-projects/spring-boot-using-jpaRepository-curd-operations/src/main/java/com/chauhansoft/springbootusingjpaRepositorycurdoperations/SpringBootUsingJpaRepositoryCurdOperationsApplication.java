package com.chauhansoft.springbootusingjpaRepositorycurdoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.chauhansoft")
//@ComponentScan(basePackages  = "com.chauhansoft")
public class SpringBootUsingJpaRepositoryCurdOperationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUsingJpaRepositoryCurdOperationsApplication.class, args);
    }

}
