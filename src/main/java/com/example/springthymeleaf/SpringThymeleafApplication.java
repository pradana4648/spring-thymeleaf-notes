package com.example.springthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafApplication.class, args);
	}
}
