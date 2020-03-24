package br.com.cbds.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Tells the Spring Boot that this is the bootstrap class for the project.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); // Call to start the entire Spring Boot service
	}
	
}
