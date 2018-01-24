package com.greenfox.frontend.models;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverserOfTheSith {
  String sith_text;

  public ReverserOfTheSith() {
  }

  public ReverserOfTheSith(String input) {
    this.sith_text = modifier(input);
  }

  public String getSith_text() {
    return sith_text;
  }

  public void setSith_text(String sith_text) {
    this.sith_text = sith_text;
  }

  private String modifier(String input) {
    ArrayList<String> randomEhh = new ArrayList<>(Arrays.asList("Arrgh. Uhmm.", "Err..err.err."));
    int randomNumber;
    ArrayList<String> newArray = new ArrayList<>(Arrays.asList(input.split(" ")));
    ArrayList<String> output = new ArrayList<>();
    for (int i = 0; i < newArray.size(); i=i+2) {
      randomNumber = (int)(Math.random()*10);
      if (!newArray.get(i).endsWith(".") || !newArray.get(i+1).endsWith(".")) {
        output.add(newArray.get(i+1));
        output.add(newArray.get(i));
      } else {
        output.add(newArray.get(i));
        output.add(newArray.get(i+1));
        if (randomNumber < 5) {
          output.add(randomEhh.get(0));
        } else {
          output.add(randomEhh.get(1));
        }
      }
    }
    return output.toString();
  }
}
