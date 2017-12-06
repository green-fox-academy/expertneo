import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class checkerBoard {
  public static void mainDraw(Graphics graphics) {
    // fill the canvas with a checkerboard pattern.

    for (int i = 0; i < HEIGHT; i=i+HEIGHT/10*2) {
      for (int j = 0; j < WIDTH; j=j+WIDTH/10*2) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(j, i, WIDTH/10, HEIGHT/10);
      }
    }

    for (int i = HEIGHT/10; i < HEIGHT; i=i+HEIGHT/10*2) {
      for (int j = WIDTH/10; j < WIDTH; j=j+WIDTH/10*2) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(j, i, WIDTH/10, HEIGHT/10);
      }
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
