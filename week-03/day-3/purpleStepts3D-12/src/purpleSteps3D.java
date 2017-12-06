import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class purpleSteps3D {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

    int x = 10;
    int y = 10;
    int size = 13;
    Color color1 = new Color(182, 68, 240);
    Color color2 = new Color(80, 67, 90);

    for (int i = 1; i < 6 ; i++) {
      rectangleDrawer(graphics, x, y, size*i, color1, color2);
      x = x+(size*i);
      y = y+(size*i);
    }
  }

  private static void rectangleDrawer(Graphics graphics, int x, int y, int size, Color color1, Color color2) {
      graphics.setColor(color1);
      graphics.fillRect(x, y, size, size);
      graphics.setColor(color2);
      graphics.drawRect(x, y, size, size);
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