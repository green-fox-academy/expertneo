package com.greenfox.coloringaround.models;

import com.greenfox.coloringaround.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;


public class Colors implements MyColor{
  private String color;


  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is " + color + " in color...");
  }

  public Colors(String color, Printer printer) {
    this.printer = printer;
    this.color = color;
  }
}
