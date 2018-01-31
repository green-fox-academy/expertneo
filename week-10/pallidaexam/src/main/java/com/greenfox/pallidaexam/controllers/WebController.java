package com.greenfox.pallidaexam.controllers;

import com.greenfox.pallidaexam.repositories.LicencePlateRepository;
import com.greenfox.pallidaexam.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {

  @Autowired
  LicencePlateService licencePlateService;

  @GetMapping("/search")
  public String search(Model model, @RequestParam(value = "q", required = false) String q,
                       @RequestParam(value = "police", required = false) String police,
                       @RequestParam(value = "diplomat", required = false) String diplomat) {
    if (q == null && police == null && diplomat == null) {
      model.addAttribute("licencePlates", licencePlateService.getAllLicencePlates());
      model.addAttribute("validator", true);
    } else if (police != null && police.equals("1")) {
      model.addAttribute("licencePlates", licencePlateService
              .getAllByPlateStartsWith("RB"));
      model.addAttribute("validator", true);
    } else if (diplomat != null && diplomat.equals("1")) {
      model.addAttribute("licencePlates", licencePlateService
              .getAllByPlateStartsWith("DT"));
      model.addAttribute("validator", true);
    } else if (q != null) {
      boolean validator = validator(q);
      System.out.println(validator);
      model.addAttribute("searchValue", q);
      model.addAttribute("licencePlates", licencePlateService
              .getAllByPlateContaining(q));
      model.addAttribute("validator", validator);
    }
    return "main";
  }

  @GetMapping("/search/{brand}")
  public String searchByBrand(Model model, @PathVariable (required = false) String brand) {
    model.addAttribute("licencePlates", licencePlateService.getAllByCarBrand(brand));
    model.addAttribute("validator", true);
    return "main";
  }

  public boolean validator(String input) {
    List<Character> charList = Arrays.asList
            ('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    '-');
    boolean output = (input.length() <= 7);
    for (int i = 0; i < input.length(); i++) {
      if (!charList.contains(Character.toUpperCase(input.charAt(i)))) {
        output = false;
      }
    }
    return output;
  }
}
