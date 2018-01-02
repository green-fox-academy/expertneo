public class Shifter implements CharSequence {
  String string;
  int shiftValue;

  public Shifter(String string, int shiftValue) {
    this.string = string;
    this.shiftValue = shiftValue;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + 2);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
