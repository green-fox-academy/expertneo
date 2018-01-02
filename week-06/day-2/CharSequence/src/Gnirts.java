public class Gnirts implements CharSequence{
  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(string.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
