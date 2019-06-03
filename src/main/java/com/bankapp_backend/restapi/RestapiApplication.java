package com.bankapp_backend.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class RestapiApplication implements RepositoryRestConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(RestapiApplication.class, args);
    }

}
