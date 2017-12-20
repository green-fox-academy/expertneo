import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Monster extends Characters {
  boolean hasKey;

  public Monster() {
  }

  public Monster(String filename, int posX, int posY) {
    this.level = 1;
    this.posX = posX;
    this.posY = posY;
    this.maxHP = 2 * level * ((int) (Math.random()*10) - 4);
    this.currentHP = maxHP;
    this.isDead = false;
    this.defense = level / 2 * ((int) (Math.random()*10) - 4);
    this.attackPower = level * ((int) (Math.random()*10) - 4);
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
