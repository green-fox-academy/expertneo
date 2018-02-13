package com.greenfox.test1;

import com.greenfox.test1.models.Dog;
import com.greenfox.test1.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Teszt1Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Teszt1Application.class, args);
  }

  @Autowired
  DogService dogService;

  @Override
  public void run(String... args) throws Exception {
    Dog dog = new Dog();
    dog.setAge(10);
    dog.setName("Lolka");

    Dog dog2 = new Dog();
    dog2.setAge(12);
    dog2.setName("Furkesz");
    dogService.createDog(dog2);
    dogService.createDog(dog);
  }
}
