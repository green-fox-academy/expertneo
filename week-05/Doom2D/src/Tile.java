import java.awt.*;

public class Tile extends AnyObjects {
  boolean isWall;

  char[][] boardMatrix = readBoard("map.txt");
  AnyObjects justACall;

  public void drawBoard(Graphics graphics, char[][] boardMatrix) {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (boardMatrix[i][j] == 'p') {
          AnyObjects floor = new AnyObjects("floor.png", j * 72, i * 72);
          floor.draw(graphics);
        } else {
          AnyObjects wall = new AnyObjects("wall.png", j * 72, i * 72);
          wall.draw(graphics);
        }
      }
    }
  }
}