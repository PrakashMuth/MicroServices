package com.service.discovery.agent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicediscoveryagentApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ServicediscoveryagentApplication.class, args);
	}

}
