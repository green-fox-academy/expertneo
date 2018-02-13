package com.greenfox.practice.services;

import com.greenfox.practice.models.Todo;
import com.greenfox.practice.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceDBImplementation implements TodoService {
  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<Todo> getAllByCreatedBy(String createdBy) {
    return todoRepository.getAllByCreatedBy(createdBy);
  }

  @Override
  public List<Todo> getAllByImportance(String importance) {
    return todoRepository.getAllByImportance(importance);
  }

  @Override
  public List<Todo> getAllById(int id) {
    return todoRepository.getAllById(id);
  }

  @Override
  public List<Todo> getAllByCreatedByAndImportance(String createdBy, String importance) {
    return todoRepository.getAllByCreatedByAndImportance(createdBy, importance);
  }

  @Override
  public List<Todo> getAllByDone(boolean done) {
    return todoRepository.getAllByDone(done);
  }

  @Override
  public List<Todo> getAllByDescriptionContaining(String query) {
    return todoRepository.getAllByDescriptionContaining(query);
  }

  @Override
  public List<Todo> getAllTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public void createTodo(Todo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void deleteTodo(int id) {
    todoRepository.delete(id);
  }

  public List<String> getAllUniqueUsers() {
    List<Todo> todos = getAllTodos();
    List<String> uniqueUserNames = new ArrayList<>();

    for (int i = 0; i < todos.size(); i++) {
      if (!uniqueUserNames.contains(todos.get(i).getCreatedBy())) {
        uniqueUserNames.add(todos.get(i).getCreatedBy());
      }
    }
    return uniqueUserNames;
  }
}
