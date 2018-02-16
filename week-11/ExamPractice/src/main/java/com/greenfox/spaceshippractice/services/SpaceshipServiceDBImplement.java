package com.greenfox.spaceshippractice.services;

import com.greenfox.spaceshippractice.models.Planet;
import com.greenfox.spaceshippractice.models.Spaceship;
import com.greenfox.spaceshippractice.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpaceshipServiceDBImplement implements SpaceshipService{

  @Autowired
  SpaceshipRepository spaceshipRepository;

  @Autowired
  PlanetService planetService;

  @Override
  public Spaceship getTheSpaceship() {
    List<Spaceship> spaceships = new ArrayList<>();
    spaceshipRepository.findAll().forEach(spaceships::add);
    return spaceships.get(0);
  }

  @Override
  public void saveSpaceship(Spaceship spaceship) {
    spaceshipRepository.save(spaceship);
  }

  @Override
  public void loadTheShip(long planetId) {
    Planet planet = planetService.getById(planetId);
    Spaceship spaceShip = getTheSpaceship();
    int spaceShipCapacityAtTheMoment = spaceShip.getMaxCapacity() - spaceShip.getUtilization();

    if (spaceShipCapacityAtTheMoment < planet.getPopulation()) {
      spaceShip.setUtilization(spaceShip.getMaxCapacity());
      planet.setPopulation(planet.getPopulation() - spaceShipCapacityAtTheMoment);
    } else if (spaceShipCapacityAtTheMoment >= planet.getPopulation()) {
      spaceShip.setUtilization(spaceShip.getUtilization() + (int) planet.getPopulation());
      planet.setPopulation(0);
    }
    spaceshipRepository.save(spaceShip);
    planetService.savePlanet(planet);
}

  @Override
  public void loadOutTheShip(long planetId) {
    Planet planet = planetService.getById(planetId);
    Spaceship spaceShip = getTheSpaceship();
    planet.setPopulation(planet.getPopulation() + spaceShip.getUtilization());
    spaceShip.setUtilization(0);
    planetService.savePlanet(planet);
    spaceshipRepository.save(spaceShip);
  }
}
