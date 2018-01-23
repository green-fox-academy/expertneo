package com.greenfox.frontend.models.Array;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArrayDouble {
  @JsonIgnore
  Integer[] input;

  Integer[] result;

  public ArrayDouble() {
  }

  public ArrayDouble(Integer[] input) {
    this.input = input;
    this.result = doubler(input);
  }

  private Integer[] doubler(Integer[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = input[i] * 2;
    }
    return input;
  }

  public Integer[] getInput() {
    return input;
  }

  public void setInput(Integer[] input) {
    this.input = input;
  }

  public Integer[] getResult() {
    return result;
  }

  public void setResult(Integer[] result) {
    this.result = result;
  }
}
