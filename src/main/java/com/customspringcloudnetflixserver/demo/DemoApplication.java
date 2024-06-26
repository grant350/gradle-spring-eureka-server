package com.customspringcloudnetflixserver.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaServer
public class DemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
