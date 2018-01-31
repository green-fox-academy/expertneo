package com.greenfox.reporting.models.entities;

import javax.persistence.*;

@Entity
@Table
public class FollowUp {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long followUpId;
  private String content;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "report_id")
  private Report report;

  public FollowUp() {
  }

  public FollowUp(String content) {
    this.content = content;
  }

  public Long getFollowUpId() {
    return followUpId;
  }

  public void setFollowUpId(Long followUpId) {
    this.followUpId = followUpId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Report getReport() {
    return report;
  }

  public void setReport(Report report) {
    this.report = report;
  }
}
