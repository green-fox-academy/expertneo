import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharpieTest {
  Sharpie asd = new Sharpie();

  @Test
  public void use() {
    int inkAmount = 100;
    int expectedOutput = 90;
    assertEquals(expectedOutput, asd.use());
  }

  @Test
  public void setWidth() {
    int expectedValue2 = 10;
    int width = 10;
    assertEquals(expectedValue2, asd.setWidth(width));
  }

}