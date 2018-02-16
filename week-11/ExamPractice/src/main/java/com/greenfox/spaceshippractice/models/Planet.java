package com.greenfox.spaceshippractice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planet")
public class Planet {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  String name;
  long population;
}
