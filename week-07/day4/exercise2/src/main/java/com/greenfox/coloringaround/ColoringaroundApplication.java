package com.greenfox.coloringaround;

import com.greenfox.coloringaround.models.MyColor;
import com.greenfox.coloringaround.models.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringaroundApplication implements CommandLineRunner{

  @Autowired
  MyColor myColor;

	public static void main(String[] args) {
		SpringApplication.run(ColoringaroundApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    myColor.printColor();
  }
}
