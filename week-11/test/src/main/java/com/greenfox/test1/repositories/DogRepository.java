package com.greenfox.test1.repositories;

import com.greenfox.test1.models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {
  Dog findByAge(int age);
  Dog findById(int id);
  Dog findByAgeAndId(int age, int id);
  List<Dog> findAllByAgeGreaterThan(int number);
}
