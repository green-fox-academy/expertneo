package com.greenfox.attendancetracker.controller;

import com.greenfox.attendancetracker.modells.People;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class WebController {
  static ArrayList<People> listOfPeople = new ArrayList<>(Arrays.asList(
          new People("Bence Papp", 0, 0, "This is a comment", false),
          new People("Bencz-Gehér Bálint", 1, 0, "The king of presenters..", false),
          new People("Bergmann Merlin", 2, 2, "Ich heisse Merlin :D", false),
          new People("Kádár Barnabás", 3, 0, "Politician", false),
          new People("Kenessey-Donáth Ferenc", 0, 0, "This is a comment", false),
          new People("Navracsics Adél", 0, 0, "This is a comment", false),
          new People("Lolka", 3, 10, "The dog", true)
  ));


//  @RequestMapping("/web/show")
//  public String show(Model model) {
//    model.addAttribute("bankName", newPeople.getName());
//    model.addAttribute("bankBalance", newPeople.getBalance());
//    model.addAttribute("bankAnimalType", newPeople.getAnimalType());
//    return "template";
//  }
//
//  @RequestMapping("/web/showException")
//  public String showException(Model model) {
//    String string = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
//    model.addAttribute("stringException", string);
//    return "HTMLception";
//  }

  @RequestMapping("/web/showTable")
  public String showList(Model model) {
    model.addAttribute("peopleList", listOfPeople);
    return "template";
  }

  @RequestMapping(value = "/web/showTable", params = {"raiseLate"})
  public String raiseLate(final HttpServletRequest request) {
    final Integer personIndex = Integer.valueOf(request.getParameter("raiseLate"));

    People person = listOfPeople.get(personIndex);
    int late = person.getLate();

    if (person.isFired()) {
      late += 0;
    } else {
      late += 1;
    }

    if (person.getLate() > 10 || person.getDayOff() > 2) {
      person.setFired(true);
    }
    person.setLate(late);
    return  "redirect:showTable";
  }

  @RequestMapping(value = "/web/showTable", params = {"raiseDayOff"})
  public String raiseDayOff(final HttpServletRequest request) {
    final Integer personIndex = Integer.valueOf(request.getParameter("raiseDayOff"));

    People person = listOfPeople.get(personIndex);
    int dayOff = person.getDayOff();

    if (person.isFired()) {
      dayOff += 0;
    } else {
      dayOff += 1;
    }

    if (person.getLate() < 11 || person.getDayOff() > 1) {
      person.setFired(true);
    }
    person.setDayOff(dayOff);
    return  "redirect:showTable";
  }

}