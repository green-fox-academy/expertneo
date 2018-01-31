package com.greenfox.reporting.services;

import com.greenfox.reporting.models.entities.FollowUp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FollowUpService {

  List<FollowUp> getAllFollowUps();
  FollowUp getFollowUp(Integer id);
  void createFollowUp(FollowUp followUp);
  void deleteFollowUp(Integer id);
  void setContent(Integer id, String content);
}
