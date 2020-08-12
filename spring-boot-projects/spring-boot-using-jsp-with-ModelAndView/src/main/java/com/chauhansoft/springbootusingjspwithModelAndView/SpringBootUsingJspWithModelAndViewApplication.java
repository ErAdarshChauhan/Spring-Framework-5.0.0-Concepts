package com.chauhansoft.springbootusingjspwithModelAndView;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.chauhansoft")
public class SpringBootUsingJspWithModelAndViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUsingJspWithModelAndViewApplication.class, args);
    }

}
