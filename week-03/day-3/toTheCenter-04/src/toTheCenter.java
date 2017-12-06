import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class toTheCenter {
  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.

    int x1 = 100;
    int y2 = 100;
    lineDrawer(graphics, x1, y2);

    x1 = 80;
    y2 = 100;
    lineDrawer(graphics, x1, y2);

    x1 = 10;
    y2 = 300;
    lineDrawer(graphics, x1, y2);
  }

  public static void lineDrawer(Graphics graphics, int x, int y) {
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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
