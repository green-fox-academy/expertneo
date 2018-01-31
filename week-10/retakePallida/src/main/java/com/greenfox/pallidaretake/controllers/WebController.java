package com.greenfox.pallidaretake.controllers;

import com.greenfox.pallidaretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

  @Autowired
  ItemService itemService;

  @GetMapping("/")
  public String getIndexPage(Model model) {
    model.addAttribute("items", itemService.getAllItems());
    model.addAttribute("uniqueItemNames", itemService.getAllUniqueItemNames());
    model.addAttribute("uniqueItemSizes", itemService.getAllUniqueSizes());
    return "index";
  }

//  @PostMapping("/shoppingplanner/results")
//  public String clickOnTheButton
}
