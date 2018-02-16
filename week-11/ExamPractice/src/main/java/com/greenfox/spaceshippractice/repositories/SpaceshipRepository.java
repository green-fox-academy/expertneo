package com.greenfox.spaceshippractice.repositories;

import com.greenfox.spaceshippractice.models.Spaceship;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceshipRepository extends CrudRepository<Spaceship, Long> {
}
