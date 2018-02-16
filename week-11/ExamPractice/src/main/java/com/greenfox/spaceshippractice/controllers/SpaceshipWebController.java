package com.greenfox.spaceshippractice.controllers;

import com.greenfox.spaceshippractice.models.Spaceship;
import com.greenfox.spaceshippractice.services.PlanetService;
import com.greenfox.spaceshippractice.services.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpaceshipWebController {

  @Autowired
  SpaceshipService spaceshipService;

  @Autowired
  PlanetService planetService;

  @GetMapping("/")
  public String getTheIndexPage(Model model) {
    model.addAttribute("spaceship", spaceshipService.getTheSpaceship());
    model.addAttribute("planets", planetService.getAllPlanets());
    return "index";
  }

  @PostMapping("/movehere/{id}")
  public String moveToId(@PathVariable (required = false) long id) {
    Spaceship currentSpaceship = spaceshipService.getTheSpaceship();
    currentSpaceship.setPlanet(planetService.getById(id).getName());
    spaceshipService.saveSpaceship(currentSpaceship);
    return "redirect:/";
  }

  @GetMapping("/toship/{id}")
  public String toShip(@PathVariable long id) {
    spaceshipService.loadTheShip(id);
    return "redirect:/";
  }

  @GetMapping("/toplanet/{id}")
  public String toPlanet(@PathVariable long id) {
    spaceshipService.loadOutTheShip(id);
    return "redirect:/";
  }
}
