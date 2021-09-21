package com.amsidh.mvc.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    @GetMapping
    public String healthCheck() {
        return "{\"status\":\"up\"}";
    }

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello Amsidh, How are you today?";
    }
}
