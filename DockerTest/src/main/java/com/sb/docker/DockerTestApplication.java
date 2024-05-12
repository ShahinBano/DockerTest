package com.sb.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
		System.out.println("Shahin is working on Git");
		System.out.println("Subhash is working on Git");
	}
}
