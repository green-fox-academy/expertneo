package com.greenfox.pallidaretake.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "warehouse")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
  @Id
  Integer id;
  @JsonProperty("item_name")
  String itemName;
  String manufacturer;
  String category;
  String size;
  @JsonProperty("unit_price")
  double unitPrice;
}
