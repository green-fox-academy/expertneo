package com.greenfox.test1.services;

import com.greenfox.test1.models.Dog;
import com.greenfox.test1.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogServiceDBImplementation implements DogService {

  @Autowired
  DogRepository dogRepository;

  @Override
  public Dog findByAge(int age) {
    return dogRepository.findByAge(age);
  }

  @Override
  public Dog findById(int id) {
    return dogRepository.findById(id);
  }

  @Override
  public Dog findByAgeAndId(int age, int id) {
    return dogRepository.findByAgeAndId(age, id);
  }

  @Override
  public List<Dog> findAllByAgeGreaterThan(int number) {
    return dogRepository.findAllByAgeGreaterThan(number);
  }

  @Override
  public List<Dog> getAllDogs() {
    List<Dog> dogs = new ArrayList<>();
    dogRepository.findAll().forEach(dogs::add);
    return dogs;
  }

  @Override
  public void createDog(Dog dog) {
    dogRepository.save(dog);
  }

  @Override
  public void deleteDogbyID(int id) {
    dogRepository.delete(id);
  }
}
