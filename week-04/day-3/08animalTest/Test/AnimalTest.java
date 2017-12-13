import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
  Animal asd = new Animal();

  @Test
  void eat() {
    int initial = asd.getHunger();
    asd.eat();
    int after = asd.getHunger();
    assertEquals(initial, after+1);
  }

  @Test
  void drink() {
  }

  @Test
  void play() {
  }

}