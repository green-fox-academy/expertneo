package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloWebController {
  int counter = 0;
  int randomNumber;
  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


  @RequestMapping("/web/greeting")
  public String greeting(Model model,
                         @RequestParam(value = "name") String content) {
    int randomNumber = (int) (Math.random()*hellos.length);
    if (content == null) {
      model.addAttribute("hello", " Hello");
      model.addAttribute("name", " World");
      model.addAttribute("counter", counter);
    } else {
      model.addAttribute("hello", hellos[randomNumber]);
      model.addAttribute("name", content);
      model.addAttribute("counter", counter);
    }
    counter = counter + 1;
    return "greeting";
  }
}
