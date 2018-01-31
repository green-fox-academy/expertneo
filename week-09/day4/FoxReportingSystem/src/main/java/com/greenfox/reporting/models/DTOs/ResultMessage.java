package com.greenfox.reporting.models.DTOs;

public class ResultMessage {

  private String status;

  public ResultMessage() {
  }

  public ResultMessage(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
