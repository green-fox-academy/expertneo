package com.greenfox.spaceshippractice.services;

import com.greenfox.spaceshippractice.models.Spaceship;
import org.springframework.stereotype.Service;

@Service
public interface SpaceshipService {
  Spaceship getTheSpaceship();
  void saveSpaceship(Spaceship spaceship);
  void loadTheShip(long planetId);
  void loadOutTheShip(long planetId);
}
