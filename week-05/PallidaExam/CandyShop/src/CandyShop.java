import java.util.ArrayList;
import java.util.List;

public class CandyShop {
  int sugar;
  double money;
  int numberOfCandies;
  int numberOfLollipops;
  List<Sweet> stock;

  public CandyShop(int sugar) {
    stock = new ArrayList<>();
    this.sugar = sugar;
  }

  public CandyShop() {
  }

  public static final String LOLLIPOP = "lollipop";

  public static final String CANDY = "candy";

  public void raise(double percentage) {
    for (int i = 0; i < stock.size() ; i++) {
      stock.get(i).setPrice(stock.get(i).getPrice() * (percentage / 100 + 1));
    }
  }

  public void sell(String input, int numberToSell) {
    if (input.equals(CANDY)) {
      for (int i = 0; i < numberToSell; i++) {
        sellCandy();
        numberOfCandies--;
      }
    } else if (input.equals(LOLLIPOP)) {
      for (int i = 0; i < numberToSell; i++) {
        sellALollopop();
        numberOfLollipops--;
      }
    }
  }

  private void sellCandy() {
    for (Sweet actualSweets : stock) {
      if (actualSweets instanceof Candy) {
        stock.remove(actualSweets);
        setMoney(getMoney() + actualSweets.getPrice());
        return;
      }
    }
  }

  private void sellALollopop() {
    for (Sweet actualSweets : stock) {
      if (actualSweets instanceof Lollipop) {
        stock.remove(actualSweets);
        setMoney(getMoney() + actualSweets.getPrice());
        return;
      }
    }
  }

  public void createSweets(String input) {
    if (input == "candy") {
      Candy newCandy = new Candy();
      setNumberOfCandies(numberOfCandies + 1);
      stock.add(newCandy);
      setSugar(getSugar() - newCandy.getSugarNeeded());
    } else if (input == "lollipop") {
      Lollipop newlolli = new Lollipop();
      setNumberOfLollipops(numberOfLollipops + 1);
      stock.add(newlolli);
    }
  }

  public void setSugar(int sugar) {
    this.sugar = sugar;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public int getSugar() {
    return this.sugar;
  }

  public double getMoney() {
    return this.money;
  }

  public void setNumberOfCandies(int numberOfCandies) {
    this.numberOfCandies = numberOfCandies;
  }

  public void setNumberOfLollipops(int numberOfLollipops) {
    this.numberOfLollipops = numberOfLollipops;
  }

  public String getInventory() {
    String inventory = "Inventory: " + numberOfCandies + " candies, " + numberOfLollipops +
            " lollipops, Income:" + getMoney() + "$, Sugar: " + getSugar() + "gr";
    return inventory;
  }

  public void buySugar(int amountOfSugarToBuy) {
    setSugar(getSugar() + amountOfSugarToBuy);
    setMoney(getMoney() - amountOfSugarToBuy / 10);
  }
}
