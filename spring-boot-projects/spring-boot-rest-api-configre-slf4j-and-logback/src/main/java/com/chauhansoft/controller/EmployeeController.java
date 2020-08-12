package com.chauhansoft.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/employee/{name}")
    public String showMsg(@PathVariable String name) {
        //get log request
        logger.debug("Request{}", name);
        if (name.equalsIgnoreCase("test")) {
            throw new RuntimeException("Ooops ! Error has occured.....");
        }
        String response = " Hey! " + name + " Welcome to Spring Boot Logging.";
        logger.debug("Response{} ", response);
        return response;
    }
}
