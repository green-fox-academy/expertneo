package com.bankofsimba.bankofsimba.controllers;

import com.bankofsimba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankingWebController {
  static ArrayList<BankAccount> listOfBankAccounts = new ArrayList<>();
  BankAccount newBankAccount = new BankAccount("Simba", 2000.00, "lion", true);


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
    listOfBankAccounts.add(new BankAccount("Nala", 4000.00, "lion", false));
    listOfBankAccounts.add(new BankAccount("Scar", 3000.00, "lion", true));
    listOfBankAccounts.add(new BankAccount("Mufasa", 1000.00, "lion", false));
    listOfBankAccounts.add(new BankAccount("Rafiki", 20.00, "ape", false));
    listOfBankAccounts.add(new BankAccount("Zazu", 200.00, "parrot", true));
    model.addAttribute("accountList", listOfBankAccounts);
    return "templateList";
  }
}
