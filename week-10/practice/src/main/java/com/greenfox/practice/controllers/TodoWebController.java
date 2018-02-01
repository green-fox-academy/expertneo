package com.greenfox.practice.controllers;

import com.greenfox.practice.models.Todo;
import com.greenfox.practice.services.TodoService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoWebController {

  @Autowired
  TodoService todoService;

  @GetMapping("/")
  public String mainPage(Model model, @RequestParam (value = "username", required = false)
          String userName, @RequestParam (value = "importance", required = false)
          String importance, @RequestParam(value = "q", required = false) String query) {
    if (userName == null && importance == null && query == null) {
      model.addAttribute("todos", todoService.getAllTodos());
    } else if (importance == null && query == null) {
      model.addAttribute("todos", todoService.getAllByCreatedBy(userName));
    } else if (userName == null && query == null){
      model.addAttribute("todos", todoService.getAllByImportance(importance));
    } else if (userName == null && importance == null) {
      model.addAttribute("todos", todoService.getAllByDescriptionContaining(query));
    } else if (query == null){
      model.addAttribute("todos", todoService.getAllByCreatedByAndImportance(userName, importance));
    }
    model.addAttribute("searchResult", query);
    return "index";
  }
}
