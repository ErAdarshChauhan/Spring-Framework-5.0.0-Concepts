package com.example.springbootusingjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class SpringBootUsingJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUsingJspApplication.class, args);
    }

//	@Bean
//    public InternalResourceViewResolver resolver() {
//        InternalResourceViewResolver vr = new InternalResourceViewResolver();
//        vr.setPrefix("/WEB-INF/view/");
//        vr.setSuffix(".jsp");
//        return vr;
//    }
}
