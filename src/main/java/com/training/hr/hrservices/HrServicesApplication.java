package com.training.hr.hrservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.client.EnableEurekaClient;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication

public class HrServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrServicesApplication.class, args);
    }

}
