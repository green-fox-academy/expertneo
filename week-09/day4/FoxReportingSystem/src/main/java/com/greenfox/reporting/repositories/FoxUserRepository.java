package com.greenfox.reporting.repositories;

import com.greenfox.reporting.models.FoxUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxUserRepository extends CrudRepository <FoxUser, Integer>{
}
