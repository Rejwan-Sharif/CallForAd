package com.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class CallForAdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallForAdApplication.class, args);
	}

}
