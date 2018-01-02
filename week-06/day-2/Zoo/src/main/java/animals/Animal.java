package main.java.animals;

abstract public class Animal {
  String name;
  int age;
  String gender;
  String breed;
  String color;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

 abstract public String breed();

}
