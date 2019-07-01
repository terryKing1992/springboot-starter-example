package com.terrylmay.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.terrylmay.springboot"})
public class SpringbootStarterExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterExampleApplication.class, args);
    }

}
