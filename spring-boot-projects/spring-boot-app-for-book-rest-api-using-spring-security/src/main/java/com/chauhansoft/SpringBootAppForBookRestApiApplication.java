package com.chauhansoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootAppForBookRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppForBookRestApiApplication.class, args);
    }

}
