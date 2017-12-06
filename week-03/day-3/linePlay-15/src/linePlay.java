import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class linePlay {
  public static void mainDraw(Graphics graphics) {
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]

    int x = 0;
    int y = 0;

    for (int i = WIDTH/15; i < WIDTH; i = i + WIDTH/15) {
      graphics.setColor(Color.BLUE);
      graphics.drawLine(i, 0, WIDTH, y+i);
    }

for (int i = HEIGHT/15; i < HEIGHT; i = i + HEIGHT/15) {
      graphics.setColor(Color.green);
      graphics.drawLine(0, i, x+i, HEIGHT);
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
