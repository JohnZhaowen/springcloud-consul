package com.john.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class ClientApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ClientApp.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		
		return new RestTemplate();
	}
}
