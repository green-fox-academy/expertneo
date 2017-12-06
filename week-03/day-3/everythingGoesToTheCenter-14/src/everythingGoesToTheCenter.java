import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class everythingGoesToTheCenter {
  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.

    int x = 0;
    int y = 0;

    // TOP and LEFT SIDE
    for (int x_top = 0; x_top < WIDTH; x_top = x_top + 20) {
      drawing(graphics, x_top, y);
    }
    for (int y_left = 0; y_left < HEIGHT; y_left = y_left + 20) {
      drawing(graphics, x, y_left);
    }

    // BOTTOM AND RIGHT SIDE
    for (int x_top = 0; x_top < WIDTH; x_top = x_top + 20) {
      drawing(graphics, x_top, HEIGHT);
    }
    for (int y_left = 0; y_left < HEIGHT; y_left = y_left + 20) {
      drawing(graphics, WIDTH, y_left);
    }
  }

  public static void drawing(Graphics graphics, int x, int y) {
    graphics.drawLine(x, y, WIDTH/2, HEIGHT/2);
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
