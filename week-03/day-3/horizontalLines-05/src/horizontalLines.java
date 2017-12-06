import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class horizontalLines {
  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.

    int x = 100;
    int y = 100;
    lineDrawer(graphics, x, y);

    x = 10;
    y = 150;
    lineDrawer(graphics, x, y);

    x = 250;
    y = 100;
    lineDrawer(graphics, x, y);

  }

  private static void lineDrawer(Graphics graphics, int x, int y) {
    graphics.drawLine(x, y, x+50, y);
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
