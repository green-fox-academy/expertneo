package main.java.music;

abstract public class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  protected String sound;

  abstract public void sound();

  public StringedInstrument(String name, int numberOfStrings) {
    super(name);
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {
  }

  @Override
  public void play() {
    sound();
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound);
  }
}
