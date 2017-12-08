import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fractalSquare {
  public static void mainDraw(Graphics graphics) {

    int level = 5;
    int x = 0;
    int y = 0;
    int size = WIDTH;

    graphics.setColor(Color.yellow);
    graphics.fillRect(0,0,WIDTH, HEIGHT);

    recursiveLoop(graphics, level, x, y, size);

//    drawSquareOutOfLines(graphics, x, y, size);

  }

  private static void drawSquareOutOfLines(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.BLACK);
    //horizontal
    graphics.drawLine(x, y + (size / 3), x + size, y + (size / 3));
    graphics.drawLine(x, y + (size * 2 / 3), x + size, y + (size * 2 / 3));
    //vertical
    graphics.drawLine(x + (size / 3), y, x + (size / 3), y + size);
    graphics.drawLine(x + (size * 2 / 3), y, x + (size * 2 / 3), y + size);
  }

  private static void recursiveLoop(Graphics graphics, int level, int x, int y, int size) {
    if (level == 0) {
      return;
    } else {
      graphics.setColor(Color.BLACK);
      drawSquareOutOfLines(graphics, x, y, size);

      int xVar1 = x + size / 3;
      int xVar2 = x + (size * 2 / 3);
      int yVar1 = y + size / 3;
      int yVar2 = y + (size * 2 / 3);

    recursiveLoop(graphics, level - 1, xVar1, y, size / 3); //1
    recursiveLoop(graphics, level - 1, xVar1, yVar2, size / 3); //3
    recursiveLoop(graphics, level - 1, x, yVar1, size / 3); //4
    recursiveLoop(graphics, level - 1, xVar2, yVar1, size / 3); //2
    }
  }


  //    Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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
