import java.util.ArrayList;
import java.util.List;

public class Farm {
  int freeSlots;
  List<Animal> farm;

  public Farm (){
    freeSlots = 10;
    farm = new ArrayList<>();
  }

  public Farm (int input) {
    freeSlots = input;
    farm = new ArrayList<>(input);
  }

public void breed(){
    if (freeSlots <= 0) {
      new Animal();
    }
}

public void slaughter(){

}




}
