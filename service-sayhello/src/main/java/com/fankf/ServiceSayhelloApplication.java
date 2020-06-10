package com.fankf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceSayhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSayhelloApplication.class, args);
    }


}
