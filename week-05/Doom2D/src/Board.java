import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  private int heroPositionX;
  private int heroPositionY;
  private int boardWidth = 720;
  private int boardHeight = 720;

  public Board() {
    heroPositionX = 0;
    heroPositionY = 0;

    // set the size of your draw board
    setPreferredSize(new Dimension(boardWidth, boardHeight));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    // here you have a 720x720 canvas
    // you can create and draw an image using the class below e.g.
    Tile map = new Tile();
    map.readBoard("map.txt");
    map.drawBoard(graphics, map.readBoard("map.txt"));

    Hero hero = new Hero("bence.png", heroPositionX, heroPositionY);
    hero.draw(graphics);
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();

    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    Hero hero = new Hero("bence.png", heroPositionX, heroPositionY);
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP && heroPositionY - 72 >= 0) {
      heroPositionY -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN && heroPositionY + 72 < boardHeight) {
      heroPositionY += 72;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroPositionX - 72 >= 0) {
      heroPositionX -= 72;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroPositionX + 72 < boardWidth) {
      heroPositionX += 72;
    }

    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}