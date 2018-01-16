package com.greenfox.todoapplication.services;

import com.greenfox.todoapplication.models.ToDo;
import com.greenfox.todoapplication.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceDBImpl implements TodoService {

  @Autowired
  TodoRepository todoRepository;

  @Override
  public List<ToDo> getAllTodos() {
    List<ToDo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todos::add);
    return todos;
  }

  @Override
  public ToDo getTodo(Integer id) {
    return todoRepository.findOne(id);
  }

  @Override
  public void create(ToDo todo) {
    todoRepository.save(todo);
  }

  @Override
  public void setDone(Integer id, boolean input) {
    ToDo todo = todoRepository.findOne(id);
    todo.setIsDone(input);
    todoRepository.save(todo);
  }

  @Override
  public void setUrgent(Integer id, boolean input) {
    ToDo todo = todoRepository.findOne(id);
    todo.setIsUrgent(input);
    todoRepository.save(todo);
  }

  @Override
  public void delete(Integer id) {
    todoRepository.delete(id);
  }

  @Override
  public void setTitle(Integer id, String string) {
    ToDo todo = todoRepository.findOne(id);
    todo.setTitle(string);
    todoRepository.save(todo);
  }
}
