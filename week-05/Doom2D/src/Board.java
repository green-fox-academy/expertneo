import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  private int initialPositionX;
  private int initialPositionY;
  private int boardWidth = 720;
  private int boardHeight = 720;

  Hero hero;
  Monster monster1;
  Monster monster2;
  Monster boss;

  int keypresses;
  double randomNumber;

  public Board() {
    initialPositionX = 0;
    initialPositionY = 0;
    keypresses = 0;

    hero = new Hero(initialPositionX, initialPositionY);
    monster1 = new Monster("skeleton.png", 72 * 5, 72 * 5);
    monster2 = new Monster("skeleton.png", 0, 72 * 7);
    boss = new Monster("boss.png", 72 * 7, 72 * 7);

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

    if (!monster1.isDead) {
      monster1.draw(graphics);
    }
    if (!monster2.isDead) {
      monster2.draw(graphics);
    }
    if (!boss.isDead) {
      boss.draw(graphics);
    }
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
    keypresses = keypresses + 1;
    randomNumber = Math.random();
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.setPosYUP(boardWidth, boardHeight);
      hero.setImageUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.setPosYDOWN(boardWidth, boardHeight);
      hero.setImageDown();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.setPosXLEFT(boardWidth, boardHeight);
      hero.setImageLeft();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.setPosXRIGHT(boardWidth, boardHeight);
      hero.setImageRight();
    }

    if (keypresses % 2 == 0) {
      boss.randomMove(boardWidth, boardHeight);
      monster1.randomMove(boardWidth, boardHeight);
      monster2.randomMove(boardWidth, boardHeight);
    } else if (keypresses % 2 == 0) {
      boss.randomMove(boardWidth, boardHeight);
      monster1.randomMove(boardWidth, boardHeight);
      monster2.randomMove(boardWidth, boardHeight);
    } else if (keypresses % 2 == 0) {
      boss.randomMove(boardWidth, boardHeight);
      monster1.randomMove(boardWidth, boardHeight);
      monster2.randomMove(boardWidth, boardHeight);
    } else if (keypresses % 2 == 0) {
      boss.randomMove(boardWidth, boardHeight);
      monster1.randomMove(boardWidth, boardHeight);
      monster2.randomMove(boardWidth, boardHeight);
    }

    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
      int variableX = hero.getPosX();
      int variableY = hero.getPosY();
      if (monster1.getPosX() == variableX && monster1.getPosY() == variableY) {
      monster1.setIsDead();
      hero.setLevel(hero.getLevel() + 1);
      } else if (monster2.getPosX() == variableX && monster2.getPosY() == variableY) {
        monster2.setIsDead();
        hero.setLevel(hero.getLevel() + 1);
      } else if (boss.getPosX() == variableX && boss.getPosY() == variableY) {
        boss.setIsDead();
        hero.setLevel(hero.getLevel() + 1);
      }
    }

    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}