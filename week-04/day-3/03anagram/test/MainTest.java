import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  Main main = new Main();

  @Test
  void anagramChecker() {
    //Method one
    String a = "Lilla";
    String b = "Bence";
    assertFalse(main.anagramChecker(a, b));

    //Method Two
    String c = "dog";
    String d = "god";
    assertTrue(main.anagramChecker(c,d));

    //Method Three (Annie)
    assertEquals(true, main.anagramChecker(c,d));
  }
}