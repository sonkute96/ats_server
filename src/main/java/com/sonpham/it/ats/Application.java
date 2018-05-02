package com.sonpham.it.ats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sonpham.it.ats")
public class Application {
    public static void main(String [] args) {
        SpringApplication.run(Application.class, args);
    }
}
