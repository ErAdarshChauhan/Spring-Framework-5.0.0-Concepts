package com.chauhansoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.chauhansoft.*")
public class SpringBootUsingH2DbAndJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUsingH2DbAndJpaApplication.class, args);
    }

}
