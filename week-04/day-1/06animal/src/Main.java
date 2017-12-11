public class Main {
  public static void main(String[] args) {

    Animal duck = new Animal();
    duck.drink();
    duck.eat();
    duck.play();

    for (int i = 0; i < 15 ; i++) {
      duck.play();
    }

    System.out.println("Hunger");
    System.out.println(duck.getHunger());
    System.out.println("Thirst");
    System.out.println(duck.getThirst());
  }
}
