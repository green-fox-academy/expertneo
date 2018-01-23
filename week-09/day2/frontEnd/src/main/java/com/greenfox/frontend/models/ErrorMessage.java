package com.greenfox.frontend.models;

public class ErrorMessage {
  String error;

  public ErrorMessage(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
