package main.java.music;

abstract public class Instrument {
  protected String name;

  public Instrument(String name) {
    this.name = name;
  }

  public Instrument() {
  }

  abstract public void play();
}
