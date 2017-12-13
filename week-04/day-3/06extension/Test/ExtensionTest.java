import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(8, extension.add(4, 4));
  } //ok

  @Test
  void testAdd_1and4is5() {
    assertEquals(8, extension.add(4, 4));
  } //ok

  @Test
  void testMaxOfThree_first() {
    assertEquals(9, extension.maxOfThree(8, 4, 9));
  } //ok

  @Test
  void testMaxOfThree_third() {
    assertEquals(14, extension.maxOfThree(3, 14, 5));
  } //ok

  @Test
  void testMedian_four() {
    assertEquals(4, extension.median(Arrays.asList(6,4,3,5)));
  } //ok

  @Test
  void testMedian_five() {
    assertEquals(13, extension.median(Arrays.asList(11,12,13,14,15)));
  } //ok

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  } //ok

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }  //ok

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }
}