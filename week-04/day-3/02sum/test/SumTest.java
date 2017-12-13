import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class SumTest {
  Sum sum = new Sum();

  @Test
  public void summation() throws Exception{
    Integer array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(array));
    assertEquals(45, sum.summation(lista2));
  }

  @Test
  public void summationEmptyList() throws Exception{
    Integer array[] = {};
    ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(array));
    assertEquals(0, sum.summation(lista3));
  }

  @Test
  public void summationOneElement() throws Exception{
    Integer array[] = {1};
    ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(array));
    assertEquals(1, sum.summation(lista3));
  }

  @Test
  public void summationNull() throws Exception{
    Integer array[] = null;
    ArrayList<Integer> lista4 = new ArrayList<>(Arrays.asList(array));
    assertEquals(null, sum.summation(lista4));
  }
}