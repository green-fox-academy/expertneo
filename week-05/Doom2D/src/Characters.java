import java.awt.*;
import java.awt.event.KeyEvent;

public class Characters extends AnyObjects {
  int currentHP;
  int maxHP;
  int defense;
  int attackPower;
  boolean isDead;
  int posX, posY;
  private Image image;

  public Characters() {
    posX = 0;
    posY = 0;
  }

  public void setPosXLEFT(){
    this.posX = posX - 72;
  }

  public void setPosXRIGHT(){
    this.posX =  posX + 72;
  }

  public void setPosYUP() {
    this.posY = posY - 72;
  }

  public void setPosYDOWN() {
    this.posY = posY + 72;
  }

}
