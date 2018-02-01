package com.greenfox.practice.services;

import com.greenfox.practice.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {
  List<Todo> getAllByCreatedBy(String createdBy);
  List<Todo> getAllByImportance(String importance);
  List<Todo> getAllById(int id);
  List<Todo> getAllByCreatedByAndImportance(String createdBy, String importance);
  List<Todo> getAllByDone(boolean done);
  List<Todo> getAllByDescriptionContaining(String query);

  List<Todo> getAllTodos();
  void createTodo(Todo todo);
  void deleteTodo(int id);
}
