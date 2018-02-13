package com.greenfox.test1.services;

import com.greenfox.test1.models.Dog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DogService {
  Dog findByAge(int age);
  Dog findById(int id);
  Dog findByAgeAndId(int age, int id);
  List<Dog> findAllByAgeGreaterThan(int number);

  List<Dog> getAllDogs();
  void createDog(Dog dog);
  void deleteDogbyID(int id);
}
