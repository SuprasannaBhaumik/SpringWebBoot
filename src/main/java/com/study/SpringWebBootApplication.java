package com.study;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebBootApplication.class, args);
	}
	
	@RequestMapping(value="/greeting")
	public String greetings() {
		return "Hello Suprasanna!!!!";
	}
}
