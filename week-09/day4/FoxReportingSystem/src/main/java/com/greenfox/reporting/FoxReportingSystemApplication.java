package com.greenfox.reporting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxReportingSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoxReportingSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
