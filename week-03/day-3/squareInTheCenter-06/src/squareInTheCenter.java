import javax.swing.*;
import java.awt.*;

import static java.awt.Window.getOwnerlessWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class squareInTheCenter {
  public static void mainDraw(Graphics graphics) {
    // draw a green 10x10 square to the canvas' center.
    int rectWidth = 100;
    int rectHeight = 100;
    graphics.setColor(Color.GREEN);
    graphics.drawRect((WIDTH/2)-(rectHeight/2), (HEIGHT/2)-(rectHeight/2), rectWidth, rectHeight);
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
