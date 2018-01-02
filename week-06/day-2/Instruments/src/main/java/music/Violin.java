package main.java.music;

public class Violin extends StringedInstrument {

  public Violin(int numberOfStrings) {
    this.name = "main.java.music.Violin";
    this.numberOfStrings = numberOfStrings;
  }

  public Violin() {
    this.name = "main.java.music.Violin";
    this.numberOfStrings = 4;
  }

  @Override
  public void sound() {
    this.sound = "Screech";
  }
}
