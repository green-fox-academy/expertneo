package com.greenfox.coloringaround.models;

import com.greenfox.coloringaround.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {
  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log("It is blue in color...");
  }
}
