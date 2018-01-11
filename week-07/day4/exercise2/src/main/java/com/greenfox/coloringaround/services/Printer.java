package com.greenfox.coloringaround.services;

import org.springframework.stereotype.Service;

@Service
public class Printer {
  public void log(String input) {
    System.out.println(input);
  }
}
