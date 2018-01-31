package com.greenfox.pallidaexam.repositories;

import com.greenfox.pallidaexam.models.LicencePlate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicencePlateRepository extends CrudRepository<LicencePlate, String> {
  List<LicencePlate> getAllByCarBrand(String carBrand);

  List<LicencePlate> getAllByPlate(String plate);

  List<LicencePlate> getAllByCarModel(String carModel);

  List<LicencePlate> getAllByColor(String color);

  List<LicencePlate> getAllByYear(String year);

  //POLICE and DIPLOMAT CAR SEARCH ENGINE
  List<LicencePlate> getAllByPlateStartsWith(String prefix);

  //Search Bar
  List<LicencePlate> getAllByPlateContaining(String string);
}
