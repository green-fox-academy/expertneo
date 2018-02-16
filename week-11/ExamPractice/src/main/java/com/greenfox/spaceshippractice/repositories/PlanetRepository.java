package com.greenfox.spaceshippractice.repositories;

import com.greenfox.spaceshippractice.models.Planet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Long>{
  Planet getById(long id);
  Planet getByName(String name);
}
