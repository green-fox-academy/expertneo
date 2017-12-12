import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Garden {
  private String gardenName;
  private String gardenSize;
  int numberOfPlants;
  List<Plant> garden;

  public Garden(){
    garden = new ArrayList<>();
    this.numberOfPlants = 0;
  }

  public void addTree (Tree tree){
    garden.add(tree);
    setNumberOfPlants(1);
  }

  public int addFlower (Flower flower) {
    garden.add(flower);
    setNumberOfPlants(1);
  }

  public int getNumberOfPlants(){
    return this.numberOfPlants;
  }

  public int setNumberOfPlants(int value){
    this.numberOfPlants = numberOfPlants + value;
    return this.numberOfPlants;
  }
}
