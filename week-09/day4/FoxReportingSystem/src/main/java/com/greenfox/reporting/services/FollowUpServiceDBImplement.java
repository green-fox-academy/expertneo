package com.greenfox.reporting.services;

import com.greenfox.reporting.models.entities.FollowUp;
import com.greenfox.reporting.repositories.FollowUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FollowUpServiceDBImplement implements FollowUpService {

  @Autowired
  FollowUpRepository followUpRepository;

  @Override
  public List<FollowUp> getAllFollowUps() {
    List<FollowUp> followUps = new ArrayList<>();
    followUpRepository.findAll().forEach(followUps::add);
    return followUps;
  }

  @Override
  public FollowUp getFollowUp(Integer id) {
    return followUpRepository.findOne(id);
  }

  @Override
  public void createFollowUp(FollowUp followUp) {
    followUpRepository.save(followUp);
  }

  @Override
  public void deleteFollowUp(Integer id) {
    followUpRepository.delete(id);
  }

  @Override
  public void setContent(Integer id, String content) {
    FollowUp followUp =  followUpRepository.findOne(id);
    followUp.setContent(content);
    followUpRepository.save(followUp);
  }
}
