package com.greenfox.practice.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Setter
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String title;
  private String description;
  private String importance;
  private String createdBy;
  private String dateAndTime;
  private boolean done;

  public Todo() {
    this.dateAndTime = String.valueOf(LocalDateTime.now());
  }

  public Todo(String title, String description, String importance, String createdBy, boolean done) {
    this.title = title;
    this.description = description;
    this.importance = importance;
    this.createdBy = createdBy;
    this.dateAndTime = String.valueOf(LocalDateTime.now());
    this.done = done;
  }
}


