package main.java.animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  @Override
  public String breed() {
    return "pushing miniature versions out.";
  }
}
