package com.greenfox.reporting.repositories;

import com.greenfox.reporting.models.entities.FoxUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxUserRepository extends CrudRepository<FoxUser, Integer>{
  FoxUser findByName(String name);
  FoxUser findByEmail(String email);
  FoxUser findByAge(int age);
}
