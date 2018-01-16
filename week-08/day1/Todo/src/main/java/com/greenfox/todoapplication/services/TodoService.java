package com.greenfox.todoapplication.services;

import com.greenfox.todoapplication.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<ToDo> getAllTodos();
  ToDo getTodo(Integer id);
  void create(ToDo todo);
  void setTitle(Integer id, String string);
  void setDone(Integer id, boolean input);
  void setUrgent(Integer id, boolean input);
  void delete(Integer id);
}
