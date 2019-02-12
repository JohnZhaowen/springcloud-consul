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
		return "client01返回....";
	}
	
	@RequestMapping("/demo01s")
	public String demo01s() {
		String url = "http://springcloud-client1/demo01";
		return restTemplate.getForObject(url, String.class);
	}
	
	@RequestMapping("/demo02")
	public String demo02() {
		String url = "http://springcloud-client2/demo02";
		return restTemplate.getForObject(url, String.class);
	}
	
	
}
