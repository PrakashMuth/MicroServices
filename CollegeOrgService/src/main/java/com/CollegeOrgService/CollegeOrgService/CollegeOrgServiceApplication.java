package com.CollegeOrgService.CollegeOrgService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class CollegeOrgServiceApplication
{

	public static void main(String[] args) {
		SpringApplication.run(CollegeOrgServiceApplication.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
}
