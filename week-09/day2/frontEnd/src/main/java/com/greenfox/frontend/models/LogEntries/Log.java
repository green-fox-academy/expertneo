package com.greenfox.frontend.models.LogEntries;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int idLog;

  String createdAt;
  String endpoint;
  String dataInput;

  public Log() {
    this.createdAt = String.valueOf(LocalDateTime.now());
  }

  public Log(String endpoint, String dataInput) {
    this.createdAt = String.valueOf(LocalDateTime.now());
    this.endpoint = endpoint;
    this.dataInput = dataInput;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getDataInput() {
    return dataInput;
  }

  public void setDataInput(String dataInput) {
    this.dataInput = dataInput;
  }

  public int getIdLog() {
    return idLog;
  }

  public void setIdLog(int idLog) {
    this.idLog = idLog;
  }
}
