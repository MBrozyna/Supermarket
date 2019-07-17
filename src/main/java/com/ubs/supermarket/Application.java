package com.ubs.supermarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ubs.supermarket")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
