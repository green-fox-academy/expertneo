package com.bankofsimba.bankofsimba;

import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class BankofsimbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankofsimbaApplication.class, args);
	}

//	@RequestMapping(value = "/show")
//	@ResponseBody
//	public String hello() {
//		return "Hello World!";
//	}
}
