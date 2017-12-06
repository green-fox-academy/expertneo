import javax.swing.*;
import java.awt.*;
import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class rainbowBoxes {
  public static void mainDraw(Graphics graphics) {
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    int size = 10;

    for (int i = 0; i < 100 ; i++) {
      size = size + 10;
      Random rand = new Random();
      float r = rand.nextFloat();
      float g = rand.nextFloat();
      float b = rand.nextFloat();
      Color randomColor = new Color(r, g, b);
      squareDrawer(graphics, size, randomColor);
    }
  }

  private static void squareDrawer(Graphics graphics, int size, Color color) {
    graphics.setColor(color);
    graphics.drawRect(WIDTH/2-size/2, HEIGHT/2-size/2, size, size);
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}
