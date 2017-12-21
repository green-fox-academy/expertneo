import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharsTest {
  List<Character> expectedOutput;
  UniqueChars object = new UniqueChars();

  @Test
  public void uniqueCharactersBasic() {
    expectedOutput = new ArrayList<>();
    expectedOutput.add('b');
    expectedOutput.add('d');
    assertEquals(expectedOutput, object.uniqueCharacters("aabccd"));
  }

  @Test
  public void uniqueCharactersEmpty() {
    expectedOutput = new ArrayList<>();
    expectedOutput.add(' ');
    assertEquals(expectedOutput, object.uniqueCharacters(" "));
  }

  @Test
  public void uniqueCharactersCapital() {
    expectedOutput = new ArrayList<>();
    expectedOutput.add('b');
    expectedOutput.add('d');
    assertEquals(expectedOutput, object.uniqueCharacters("AaBCcD"));
  }
}