package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name") String content) {
      Greeting newGreeting = new Greeting(1 , "Hello, " + content);
      return newGreeting;
  }
}
