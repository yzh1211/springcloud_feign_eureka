package com.example.clientdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Clientdemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Clientdemo3Application.class, args);
    }

}
