package com.example.vosungconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VosungConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VosungConfigClientApplication.class, args);
	}

}
