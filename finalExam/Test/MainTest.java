import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
  int[] arrayOne = {1, 2, 3};
  int[] arrayTwo = {6, 7, 8};
  int[] expectedResult = {1, 6 ,2, 7, 3, 8};
  Main main = new Main();

  @Test
  public void mixer_bestSolution_test() throws Exception {
    assertArrayEquals(expectedResult, main.mixer_bestSolution(arrayOne, arrayTwo));
    assertTrue(main.mixer_bestSolution(arrayOne, arrayTwo).length == expectedResult.length);
  }

  @Test
  public void mixer_solutionTwo_test() throws Exception {
    assertArrayEquals(expectedResult, main.mixer_solutionTwo(arrayOne, arrayTwo));
    assertTrue(main.mixer_solutionTwo(arrayOne, arrayTwo).length == expectedResult.length);
  }

  @Test
  public void mixer_solutionThree_test() throws Exception {
    assertArrayEquals(expectedResult, main.mixer_solutionThree(arrayOne, arrayTwo));
    assertTrue(main.mixer_solutionThree(arrayOne, arrayTwo).length == expectedResult.length);
  }
}