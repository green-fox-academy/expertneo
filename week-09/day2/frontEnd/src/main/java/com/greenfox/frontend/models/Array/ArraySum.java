package com.greenfox.frontend.models.Array;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ArraySum {
  @JsonIgnore
  Integer[] input;

  Integer result = 0;

  public ArraySum() {
  }

  public ArraySum(Integer[] input) {
    this.input = input;
    this.result = summator(input);
  }

  public int summator(Integer[] input) {
    for (int i = 0; i < input.length; i++) {
      result += input[i];
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
