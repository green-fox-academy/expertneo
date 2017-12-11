public class Animal {
  int hunger = 50;
  int thirst = 50;

  public void eat(){
    hunger -= 1;
  }

  public void drink (){
    thirst -= 1;
  }

  public void play (){
    hunger += 1;
    thirst += 1;
  }

  public int getHunger(){
    return this.hunger;
  }

  public int getThirst() {
    return this.thirst;
  }
}
