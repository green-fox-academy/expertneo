import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {
  Apple jonatan = new Apple();

  @Test
  void getName() {
    assertEquals("Golden", jonatan.getName());
  }
}