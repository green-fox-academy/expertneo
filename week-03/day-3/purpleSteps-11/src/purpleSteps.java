import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class purpleSteps {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

    int x = 10;
    int y = 10;
    int size = 3;
    Color color1 = new Color(182, 68, 240);
    Color color2 = new Color(80, 67, 90);

      rectangleDrawer(graphics, x, y, size, color1, color2);
  }

  private static void rectangleDrawer(Graphics graphics, int x, int y, int size, Color color1, Color color2) {
    for (int i = 0; i < 19*(size+10); i=i+size+10) {
      graphics.setColor(color1);
      graphics.fillRect(x+i, y+i, x+size, y+size);
      graphics.setColor(color2);
      graphics.drawRect(x+i, y+i, x+size, y+size);
    }
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
