import java.awt.*;

public class Main {
  public static void main(String[] args) {

    Sharpie asd1 = new Sharpie();

    asd1.setColor(Color.red);
    asd1.setWidth(10);

    asd1.use();   // usage 1
    asd1.use();   // usage 2

    System.out.println("Color: " + asd1.getColor());
    System.out.println("Width: " + asd1.getWidth());
    System.out.println("InkAmount: " + asd1.getInkAmount());
  }
}