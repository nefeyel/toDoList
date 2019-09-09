package com.nefeyel.spring.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nefeyel.spring.firstspringbootproject")
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootProjectApplication.class, args);
	}

}
