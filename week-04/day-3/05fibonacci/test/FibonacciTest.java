import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
  Fibonacci asd = new Fibonacci();

  @Test
  public void fibonacciCalculator() {
    int n = 7;
    int expectedValue = 13;
    assertEquals(expectedValue, asd.fibonacciCalculator(n));
  }

}