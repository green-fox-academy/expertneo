package com.greenfox.frontend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
