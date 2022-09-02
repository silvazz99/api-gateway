package com.apiGateway.TotalShakeGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TotalShakeGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TotalShakeGatewayApplication.class, args);
	}

}
