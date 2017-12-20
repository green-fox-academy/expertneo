import java.awt.*;
import java.util.concurrent.Flow;

public class Main {
  public static void main(String[] args) {

    Garden kert = new Garden();
    Flower flower1 = new Flower("Yellow", 0);
    Flower flower2 = new Flower("Blue", 0);

    Tree tree1 = new Tree("Blue", 0);
    Tree tree2 = new Tree("Red", 0);

    kert.addFlower(flower1);
    kert.addFlower(flower2);
    kert.addTree(tree1);
    kert.addTree(tree2);

    showStatusFlower(flower1);
    showStatusFlower(flower2);
    showStatusTree(tree1);
    showStatusTree(tree2);

    int watering1 = 40;
    System.out.println("Watering with " + watering1);
    flower1.water(watering1);
    flower2.water(watering1);
    tree1.water(watering1);
    tree2.water(watering1);

    showStatusFlower(flower1);
    showStatusFlower(flower2);
    showStatusTree(tree1);
    showStatusTree(tree2);
  }

  private static void showStatusFlower(Flower flower) {
    System.out.println("The " + (flower.getColor()) + " " + flower.getType() + " " + flower.isNeedWater());
  }

  private static void showStatusTree(Tree tree) {
    System.out.println("The " + (tree.getColor()) + " " + tree.getType() + " " + tree.isNeedWater());
  }
}
