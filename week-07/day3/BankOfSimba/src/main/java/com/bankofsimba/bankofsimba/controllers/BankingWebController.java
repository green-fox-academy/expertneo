package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankingWebController {
  BankAccount newBankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/web/show")
  public String show(Model model) {
      model.addAttribute("bankName", newBankAccount.getName());
      model.addAttribute("bankBalance", newBankAccount.getBalance());
      model.addAttribute("bankAnimalType", newBankAccount.getAnimalType());
    return "template";
  }
}
