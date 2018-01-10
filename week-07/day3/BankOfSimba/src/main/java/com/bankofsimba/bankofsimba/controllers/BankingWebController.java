package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankingWebController {
  static ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>(Arrays.asList(
          new BankAccount("Nala", 4000.00, "lion", false, false),
          new BankAccount("Scar", 3000.00, "lion", true, true ),
          new BankAccount("Mufasa", 1000.00, "lion", false, false),
          new BankAccount("Rafiki", 20.00, "ape", false, true),
          new BankAccount("Zazu", 200.00, "parrot", true, false)
  ));
  BankAccount newBankAccount = new BankAccount("Simba", 2000.00, "lion", true, true);


  @RequestMapping("/web/show")
  public String show(Model model) {
      model.addAttribute("bankName", newBankAccount.getName());
      model.addAttribute("bankBalance", newBankAccount.getBalance());
      model.addAttribute("bankAnimalType", newBankAccount.getAnimalType());
    return "template";
  }

  @RequestMapping("/web/showException")
  public String showException(Model model) {
    String string = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("stringException", string);
    return "HTMLception";
  }

  @RequestMapping("/web/showTable")
  public String showList(Model model) {
    model.addAttribute("accountList", listOfBankAccounts);
    return "templateList";
  }
}
