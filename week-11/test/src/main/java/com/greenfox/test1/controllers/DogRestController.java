package com.greenfox.test1.controllers;

import com.greenfox.test1.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogRestController {

  @Autowired
  DogService dogService;

  @GetMapping("/")
  public Object listAllDogs() {
    return dogService.getAllDogs();
  }
}
