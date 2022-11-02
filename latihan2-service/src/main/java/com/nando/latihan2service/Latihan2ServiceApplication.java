package com.nando.latihan2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Latihan2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Latihan2ServiceApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "latihan 2") String name) {
        return String.format("Hello %s!", name);
    }
}
