package com.greenfox.hellobeanworld;

import com.greenfox.hellobeanworld.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

	@Autowired
	Printer printer;

	public static void main(String[] args) {
		SpringApplication.run(HellobeanworldApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		printer.log("hello");
	}
}
