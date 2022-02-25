package com.poscoict.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

}
