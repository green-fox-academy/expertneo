package com.greenfox.todoapplication.repositories;

import com.greenfox.todoapplication.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<ToDo, Integer>{
}
