package com.greenfox.frontend.models.DoUntil;

public class DoUntilSum {
  int result;

  public DoUntilSum() {
  }

  public DoUntilSum(int input) {
    this.result = summation(input);
  }

  private int summation(int input) {
    int tempVariable=0;
    for (int i = 0; i < input+1; i++) {
      tempVariable += i;
    }
    return tempVariable;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
