package com.example.samplespringbatchapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleSpringbatchAppApplication {

	@GetMapping
	public String message(){
		return "Welcome to Nikhil Docker App";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringbatchAppApplication.class, args);
	}

}
