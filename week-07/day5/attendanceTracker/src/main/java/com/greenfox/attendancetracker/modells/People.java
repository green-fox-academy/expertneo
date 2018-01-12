package com.greenfox.attendancetracker.modells;

public class People {
  String name;
  int late;
  int dayOff;
  String comment;
  boolean fired;

  public People() {
  }

  public People(String name, int late, int dayOff, String comments, boolean fired) {
    this.name = name;
    this.late = late;
    this.dayOff = dayOff;
    this.comment = comments;
    this.fired = fired;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLate() {
    return late;
  }

  public void setLate(int late) {
    this.late = late;
  }

  public int getDayOff() {
    return dayOff;
  }

  public void setDayOff(int dayOff) {
    this.dayOff = dayOff;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public boolean isFired() {
    return fired;
  }

  public void setFired(boolean fired) {
    this.fired = fired;
  }
}