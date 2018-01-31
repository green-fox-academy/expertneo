package com.greenfox.reporting.services;

import com.greenfox.reporting.models.entities.FoxUser;
import com.greenfox.reporting.repositories.FoxUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxUserServiceDBImplement implements FoxUserService {

  @Autowired
  FoxUserRepository foxUserRepository;

  @Override
  public List<FoxUser> getAllFoxUsers() {
    List<FoxUser> foxUsers = new ArrayList<>();
    foxUserRepository.findAll().forEach(foxUsers::add);
    return foxUsers;
  }

  @Override
  public FoxUser getFoxUser(Integer id) {
    return foxUserRepository.findOne(id);
  }

  @Override
  public void createFoxUser(FoxUser foxUser) {
    foxUserRepository.save(foxUser);
  }

  @Override
  public void deleteFoxUser(Integer id) {
    foxUserRepository.delete(id);
  }

  @Override
  public void setName(Integer id, String name) {
    FoxUser foxUser = foxUserRepository.findOne(id);
    foxUser.setName(name);
    foxUserRepository.save(foxUser);
  }

  @Override
  public void setEmail(Integer id, String email) {
    FoxUser foxUser = foxUserRepository.findOne(id);
    foxUser.setEmail(email);
    foxUserRepository.save(foxUser);
  }

  @Override
  public void setAge(Integer id, int age) {
    FoxUser foxUser = foxUserRepository.findOne(id);
    foxUser.setAge(age);
    foxUserRepository.save(foxUser);
  }

  // SQL QUERYs

  @Override
  public FoxUser findByName(String name) {
    for (FoxUser foxUser : foxUserRepository.findAll()) {
      if (foxUser.getName().equals(name)) {
        return foxUser;
      }
    }
    FoxUser foxUser = new FoxUser();
    foxUser.setName(name);
    return foxUser;
  }

  @Override
  public FoxUser findByEmail(String email) {
    for (FoxUser foxUser : foxUserRepository.findAll()) {
      if (foxUser.getEmail().equals(email)) {
        return foxUser;
      } else {
        return null;
      }
    }
    return null;
  }

  @Override
  public FoxUser findByAge(int age) {
    for (FoxUser foxUser : foxUserRepository.findAll()) {
      if (foxUser.getAge() == age) {
        return foxUser;
      } else {
        return null;
      }
    }
    return null;
  }
}
