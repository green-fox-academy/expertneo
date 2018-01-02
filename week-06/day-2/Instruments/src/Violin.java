public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    this.name = "Violin";
    this.numberOfStrings = numberOfStrings;
  }

  public Violin() {
    this.name = "Violin";
    this.numberOfStrings = 4;
  }

  @Override
  public void sound() {
    this.sound = "Screech";
  }
}
