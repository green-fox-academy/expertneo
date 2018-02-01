package com.greenfox.practice.controllers;

import com.greenfox.practice.models.Todo;
import com.greenfox.practice.models.TodoDTO;
import com.greenfox.practice.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoRestController {

  @Autowired
  TodoService todoService;

  @GetMapping("/api/{userName}")
  public ResponseEntity<?> getTodosForASpecificUser(@PathVariable String userName) {
    TodoDTO returnDTO = new TodoDTO();
    if (userName == null) {
      returnDTO.setResult("Error");
      return ResponseEntity.badRequest().body(returnDTO);
    } else {
      returnDTO.setResult("Ok");
      returnDTO.setTasks(todoService.getAllByCreatedBy(userName));
      return ResponseEntity.ok().body(returnDTO);
    }
  }

  @PostMapping("/api/{userName}/create")
  public ResponseEntity<?> createTodoWithREST(@PathVariable("userName") String userName,
                                              @RequestBody Todo todo) {
    TodoDTO newTodoDTO = new TodoDTO();
    if (userName == null && todo != null) {
      newTodoDTO.setResult("Error");
      return ResponseEntity.badRequest().body(newTodoDTO);
    } else {
      newTodoDTO.setResult("Ok, Todo created!");
      todo.setCreatedBy(userName);
      todoService.createTodo(todo);
      List<Todo> tasks =todoService.getAllByCreatedBy(userName);
      newTodoDTO.setTasks(tasks);
      return ResponseEntity.ok().body(newTodoDTO);
    }
  }
}
