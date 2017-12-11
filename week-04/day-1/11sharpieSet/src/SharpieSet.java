import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> lista;

  public SharpieSet(){
    lista = new ArrayList<>();
  }

  public void addSharpies (Sharpie sharpie) {
    lista.add(sharpie);
  }

  public boolean isUsable (Sharpie sharpie){
    boolean result = false;
    if (sharpie.inkAmount >= 0) {
      result = true;
    }
    return result;
  }

  public void removeTrash (){
    for (int i = 0; i < lista.size(); i++) {
      if (isUsable(lista.get(i)) == true) {
        lista.remove(i);
      }
    }
  }
}
