package com.greenfox.test1.controllers;

import com.greenfox.test1.models.Dog;
import com.greenfox.test1.services.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DogWebController {

  @Autowired
  DogService dogService;

  @GetMapping("/API/")
  public String indexPage() {
    return "index";
  }
}
