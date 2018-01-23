package com.greenfox.frontend.models.DoUntil;

public class DoUntilFactor {
  int result;

  public DoUntilFactor() {
  }

  public DoUntilFactor(int input) {
    this.result = factoring(input);
  }

  private int factoring(int input) {
    int output = 1;
    for (int i = 1; i < input + 1; i++) {
     output *= i;
    }
    return output;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
