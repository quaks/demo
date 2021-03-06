package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {DemoApplication.class}, args);
	}
}
