package com.greenfox.spaceshippractice.services;

import com.greenfox.spaceshippractice.models.Planet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanetService {
  Planet getById(long id);
  Planet getByName(String name);

  List<Planet> getAllPlanets();
  void savePlanet(Planet planet);
}
