package com.enset.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatwayApplication.class, args);
	}
	@Bean
	DiscoveryClientRouteDefinitionLocator discoveryClientRouteDefinitionLocator(ReactiveDiscoveryClient rdc,
																				DiscoveryLocatorProperties rdp){
		return new DiscoveryClientRouteDefinitionLocator(rdc, rdp);
	}

}
