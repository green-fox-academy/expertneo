package com.greenfox.frontend.repositories;

import com.greenfox.frontend.models.LogEntries.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Integer>{
}
