package com.greenfox.pallidaretake.controllers;

import com.greenfox.pallidaretake.models.Item;
import com.greenfox.pallidaretake.models.ItemData;
import com.greenfox.pallidaretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

  @Autowired
  ItemService itemService;

  @GetMapping("/")
  public String getIndexPage(Model model, @ModelAttribute ItemData itemData) {
    model.addAttribute("items", itemService.getAllItems());
    model.addAttribute("uniqueItemNames", itemService.getAllUniqueItemNames());
    model.addAttribute("uniqueItemSizes", itemService.getAllUniqueSizes());
    model.addAttribute("newItemData", new ItemData());
    return "index";
  }

  @PostMapping("/summary")
  public String shoppingPlannerSummary(Model model, @ModelAttribute ItemData itemData) {
    Item newItem = itemService.getByItemNameAndSize(itemData.getName(), itemData.getSize());

    double price = itemData.getQuantity()*newItem.getUnitPrice();
    model.addAttribute("quantity", itemData.getQuantity());
    model.addAttribute("totalPrice", price);
    model.addAttribute("price", newItem.getUnitPrice());
    model.addAttribute("item", newItem);
    return "summary";
  }
}
