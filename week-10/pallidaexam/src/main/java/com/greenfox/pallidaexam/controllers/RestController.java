package com.greenfox.pallidaexam.controllers;

import com.greenfox.pallidaexam.models.LicencePlateDTO;
import com.greenfox.pallidaexam.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  LicencePlateService licencePlateService;

  @GetMapping("/api/search/{brand}")
  public ResponseEntity<?> getByBrand(@PathVariable(required = false) String brand) {
    LicencePlateDTO licencePlateDTO = new LicencePlateDTO();
    licencePlateDTO.setData(licencePlateService.getAllByCarBrand(brand));
    licencePlateDTO.setResult("ok");
    return ResponseEntity.ok().body(licencePlateDTO);
  }
}
