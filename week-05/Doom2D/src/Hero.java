import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Characters {
  BufferedImage image;
  int level;

  public Hero() {
  }

  public Hero(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    this.level = 1;
    this.maxHP = 1000;
    this.currentHP = maxHP;
    this.isDead = false;
    this.defense = 100;
    this.attackPower = 100;
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
