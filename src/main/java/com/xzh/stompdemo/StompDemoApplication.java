package com.xzh.stompdemo;

import org.n3r.idworker.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StompDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StompDemoApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(2L);
    }

}
