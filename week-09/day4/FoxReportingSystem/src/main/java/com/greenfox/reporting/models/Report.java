package com.greenfox.reporting.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Report {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long reportId;
  private boolean isActive;
  private String category;
  private String title;
  private String body;
  private String actionItem;
  private String eventDate;
  private String dueDate;
  private String timeStampOfTheReport;

  @ManyToOne
  List<FollowUp> followUps = new ArrayList<>();

  public Report() {
    this.timeStampOfTheReport = String.valueOf(LocalDateTime.now());
    this.isActive = true;
  }

  public Report(String category, String title, String body, String actionItem, String eventDate, String dueDate) {
    this.isActive = true;
    this.category = category;
    this.title = title;
    this.body = body;
    this.actionItem = actionItem;
    this.eventDate = eventDate;
    this.dueDate = dueDate;
    this.timeStampOfTheReport = String.valueOf(LocalDateTime.now());
  }

  public Long getReportId() {
    return reportId;
  }

  public void setReportId(Long reportId) {
    this.reportId = reportId;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getActionItem() {
    return actionItem;
  }

  public void setActionItem(String actionItem) {
    this.actionItem = actionItem;
  }

  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public String getTimeStampOfTheReport() {
    return timeStampOfTheReport;
  }

  public void setTimeStampOfTheReport(String timeStampOfTheReport) {
    this.timeStampOfTheReport = timeStampOfTheReport;
  }

  public List<FollowUp> getFollowUps() {
    return followUps;
  }

  public void setFollowUps(List<FollowUp> followUps) {
    this.followUps = followUps;
  }
}
