package com.greenfox.coloringaround;

import com.greenfox.coloringaround.models.Colors;
import com.greenfox.coloringaround.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ColoringaroundApplication implements CommandLineRunner{

  @Autowired
  Printer printer;

	public static void main(String[] args) {
		SpringApplication.run(ColoringaroundApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    List<Colors> listOfColors = new ArrayList<>();
    listOfColors.add(new Colors("red", printer));
    listOfColors.add(new Colors("blue", printer));
    listOfColors.add(new Colors("green", printer));
    listOfColors.get(0).printColor();
  }
}
