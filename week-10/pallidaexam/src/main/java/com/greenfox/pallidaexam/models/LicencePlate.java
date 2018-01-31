package com.greenfox.pallidaexam.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "licence_plates")
@Entity
public class LicencePlate {
  @Id
  String plate;

  @JsonProperty("car_brand")
//  @Column(name = "car_brand")
          String carBrand;

  @JsonProperty("car_model")
//  @Column(name = "car_model")
          String carModel;

  String year;
  String color;
}
