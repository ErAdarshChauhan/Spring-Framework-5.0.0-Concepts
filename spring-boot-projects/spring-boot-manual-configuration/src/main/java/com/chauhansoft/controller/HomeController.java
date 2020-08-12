package com.chauhansoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String homePage() {
        return "Welcome to Spring Boot.";
    }

    @RequestMapping("/home/hello")
    public String helloPage() {
        return "Hey! Mr. Adarsh Chauhan Welcome to Spring Boot.";
    }
}
