package com.greenfox.spaceshippractice.services;

import com.greenfox.spaceshippractice.models.Planet;
import com.greenfox.spaceshippractice.repositories.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanetServiceDBImplement implements PlanetService {

  @Autowired
  PlanetRepository planetRepository;

  @Override
  public Planet getById(long id) {
    return planetRepository.getById(id);
  }

  @Override
  public Planet getByName(String name) {
    return planetRepository.getByName(name);
  }

  @Override
  public List<Planet> getAllPlanets() {
    List<Planet> planets = new ArrayList<>();
    planetRepository.findAll().forEach(planets::add);
    return planets;
  }

  @Override
  public void savePlanet(Planet planet) {
    planetRepository.save(planet);
  }
}
