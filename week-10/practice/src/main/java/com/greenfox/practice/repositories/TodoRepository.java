package com.greenfox.practice.repositories;

import com.greenfox.practice.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer> {
  List<Todo> getAllByCreatedBy(String createdBy);
  List<Todo> getAllByImportance(String importance);
  List<Todo> getAllById(int id);
  List<Todo> getAllByCreatedByAndImportance(String createdBy, String importance);
  List<Todo> getAllByDone(boolean done);
  List<Todo> getAllByDescriptionContaining(String query);
}
