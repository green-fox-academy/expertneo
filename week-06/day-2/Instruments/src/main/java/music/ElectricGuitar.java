package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar(int numberOfStrings) {
    this.name = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }

  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  @Override
  public void sound() {
    this.sound = "Twang";
  }
}
