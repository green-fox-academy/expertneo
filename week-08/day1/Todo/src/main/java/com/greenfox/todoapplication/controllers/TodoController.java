package com.greenfox.todoapplication.controllers;

import com.greenfox.todoapplication.models.ToDo;
import com.greenfox.todoapplication.repositories.TodoRepository;
import com.greenfox.todoapplication.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping(value = {"/", "/list"})
  public String list(Model model,
                     @RequestParam(value = "isActive", required = false) boolean parameter) {
    if (parameter) {
      List<ToDo> todos = todoService.getAllTodos();
      List<ToDo> filteredTodos = new ArrayList<>();
      for (int i = 0; i < todos.size(); i++) {
        if (todos.get(i).isDone()) {
          filteredTodos.add(todos.get(i));
        }
      }
      model.addAttribute("todos", filteredTodos);
    } else if (!parameter) {
      List<ToDo> todos = todoService.getAllTodos();
      List<ToDo> filteredTodos = new ArrayList<>();
      for (int i = 0; i < todos.size(); i++) {
        if (!todos.get(i).isDone()) {
          filteredTodos.add(todos.get(i));
        }
      }
      model.addAttribute("todos", filteredTodos);
    } else {
      List<ToDo> todos = todoService.getAllTodos();
      model.addAttribute("todos", todos);
    }
    return "index";
  }

//  @GetMapping(value = {"/add"})
//  public String add(Model model) {
//    List<ToDo> todos = todoService.getAllTodos();
//    model.addAttribute("todos", todos);
//    return "index";
//  }
}
