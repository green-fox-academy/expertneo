import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Characters extends AnyObjects {
  int currentHP;
  int maxHP;
  int defense;
  int attackPower;
  boolean isDead;
  int posX, posY;
  BufferedImage image;
  Tile ads;
  AnyObjects justACall;
  Hero hero;

  public Characters() {
  }

  public int getPosX() {
    return posX;
  }

  public void setPosXLEFT(int totalWidth, int totalHeight){
    if (posX - 72 >= 0 && canWalkThereChecker("map.txt")[posY / 72][posX / 72 - 1]) {
      this.posX = posX - 72;
    }
  }

  public void setPosXRIGHT(int totalWidth, int totalHeight){
    if (posX + 72 < totalWidth && canWalkThereChecker("map.txt")[ posY / 72][posX  / 72 + 1]) {
      this.posX =  posX + 72;
    }
  }

  public void setPosYUP(int totalWidth, int totalHeight) {
    if (posY - 72 >= 0 && canWalkThereChecker("map.txt")[posY / 72 - 1][posX / 72]) {
      this.posY = posY - 72;
    }
  }

  public void setPosYDOWN(int totalWidth, int totalHeight) {
    if (posY + 72 < totalHeight && canWalkThereChecker("map.txt")[posY / 72 + 1][posX / 72]) {
      this.posY = posY + 72;
    }
  }

  public boolean[][] canWalkThereChecker(String fileName) {
    char[][] labirinthLayout = readBoard(fileName);
    boolean[][] canWalkThere = new boolean[10][10];
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (labirinthLayout[i][j] == 'p') {
          canWalkThere[i][j] = true;
        } else {
          canWalkThere[i][j] = false;
        }
      }
    }
    return canWalkThere;
  }
}
