package com.greenfox.pallidaexam.services;

import com.greenfox.pallidaexam.models.LicencePlate;
import com.greenfox.pallidaexam.repositories.LicencePlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LicencePlateService {
  @Autowired
  LicencePlateRepository licencePlateRepository;

  public List<LicencePlate> getAllLicencePlates() {
    List<LicencePlate> licencePlates = new ArrayList<>();
    licencePlateRepository.findAll().forEach(licencePlates :: add);
    return licencePlates;
  }

  public List<LicencePlate> getAllByCarBrand(String carBrand) {
    return licencePlateRepository.getAllByCarBrand(carBrand);
  }

  public List<LicencePlate> getAllByPlate(String plate) {
    return licencePlateRepository.getAllByPlate(plate);
  }

  public List<LicencePlate> getAllByCarModel(String carModel) {
    return licencePlateRepository.getAllByCarModel(carModel);
  }

  public List<LicencePlate> getAllByColor(String color) {
    return licencePlateRepository.getAllByColor(color);
  }

  public List<LicencePlate> getAllByYear(String year) {
    return licencePlateRepository.getAllByYear(year);
  }

  //POLICE and DIPLOMAT CAR SEARCH ENGINE
  public List<LicencePlate> getAllByPlateStartsWith(String prefix) {
    return licencePlateRepository.getAllByPlateStartsWith(prefix);
  }

  //SEARCH BAR
  public List<LicencePlate> getAllByPlateContaining(String string) {
    return licencePlateRepository.getAllByPlateContaining(string);
  }
}
