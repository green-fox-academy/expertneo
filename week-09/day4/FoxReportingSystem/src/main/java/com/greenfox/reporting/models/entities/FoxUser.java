package com.greenfox.reporting.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class FoxUser {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long foxUserId;
  private String name;
  private String email;
  private int age;

  @OneToMany (fetch = FetchType.LAZY, mappedBy = "foxuser")
  List<Report> reports = new ArrayList<>();


  public FoxUser() {
  }

  public FoxUser(String name, String email, int age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public Long getFoxUserId() {
    return foxUserId;
  }

  public void setFoxUserId(Long foxUserId) {
    this.foxUserId = foxUserId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public List<Report> getReports() {
    return reports;
  }

  public void setReports(List<Report> reports) {
    this.reports = reports;
  }
}
