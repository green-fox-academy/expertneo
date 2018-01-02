public class BassGuitar extends StringedInstrument {

  public BassGuitar(int numberOfStrings) {
    this.name = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public BassGuitar() {
    this.name = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  @Override
  public void sound() {
    this.sound = "Duum-duum-duum";
  }
}
