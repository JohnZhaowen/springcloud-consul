package com.john.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Client1Controller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/demo01")
	public String demo01() {
		//String url = "http://springcloud-client1/demo01";
		String url = "http://service-producer/demo01";
		return restTemplate.getForObject(url, String.class);
	}
	
	@RequestMapping("/demo02")
	public String demo02() {
		return "client02返回....";
	}
}
