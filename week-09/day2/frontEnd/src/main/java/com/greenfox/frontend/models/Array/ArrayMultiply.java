package com.greenfox.frontend.models.Array;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArrayMultiply {
  @JsonIgnore
  Integer[] input;

  Integer result = 0;

  public ArrayMultiply() {
  }

  public ArrayMultiply(Integer[] input) {
    this.input = input;
    this.result = multiplyer(input);
  }

  private int multiplyer(Integer[] input) {
    for (int i = 0; i < input.length; i++) {
      result *= input[i];
    }
    return result;
  }

  public Integer[] getInput() {
    return input;
  }

  public void setInput(Integer[] input) {
    this.input = input;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
