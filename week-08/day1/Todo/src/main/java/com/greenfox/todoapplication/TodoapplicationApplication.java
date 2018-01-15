package com.greenfox.todoapplication;

import com.greenfox.todoapplication.models.ToDo;
import com.greenfox.todoapplication.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoapplicationApplication implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		todoRepository.save(new ToDo("I have to learn Object Relational Mapping", true, false));
//		todoRepository.save(new ToDo("Entry two", true, false));
//		todoRepository.save(new ToDo("Wipe ass", false, false));
//		todoRepository.save(new ToDo("Get drunk", true, true));
	}
}
