package com.greenfox.attendancetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class AttendancetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendancetrackerApplication.class, args);
	}
}
