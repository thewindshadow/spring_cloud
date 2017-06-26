package com.battle;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer01Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServer01Application.class).web(true).run(args);
	}

}
