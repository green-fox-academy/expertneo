import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  Main main = new Main();

  @Test
  public void letterCounter() throws Exception{
    String trial1 = "lilla";
    HashMap<String, Integer> map = new HashMap<String, Integer>(){{put("l",3); put("i", 1);
    put("a", 1);}};
    assertEquals(map, main.letterCounter(trial1));
  }
}