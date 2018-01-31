package com.greenfox.reporting.services;

import com.greenfox.reporting.models.entities.FoxUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoxUserService {

  List<FoxUser> getAllFoxUsers();
  FoxUser getFoxUser(Integer id);
  void createFoxUser(FoxUser foxUser);
  void deleteFoxUser(Integer id);
  void setName(Integer id, String name);
  void setEmail(Integer id, String email);
  void setAge(Integer id, int age);

  FoxUser findByName(String name);
  FoxUser findByEmail(String email);
  FoxUser findByAge(int age);
}
