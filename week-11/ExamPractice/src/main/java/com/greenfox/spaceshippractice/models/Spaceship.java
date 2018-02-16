package com.greenfox.spaceshippractice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spaceship")
public class Spaceship {
  @Id
  long id;

  @JsonProperty("max_capacity")
  int maxCapacity;
  String planet;
  int utilization;
}
