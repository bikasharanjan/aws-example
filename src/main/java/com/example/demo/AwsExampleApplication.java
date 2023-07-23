package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsExampleApplication {
	
	@GetMapping("/home")
	public String message() {
		return "my first aws deployment";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsExampleApplication.class, args);
		
	}

}
