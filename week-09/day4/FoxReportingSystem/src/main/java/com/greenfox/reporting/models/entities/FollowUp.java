package com.greenfox.reporting.models.FollowUp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FollowUp {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long followUpId;
  private String content;

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
}
