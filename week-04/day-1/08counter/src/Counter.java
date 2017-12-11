public class Counter {
  int initialValue;
  int value;

  public Counter(){
    this.initialValue = 0;
    this.value = 0;
  }

  public Counter (int input) {
    initialValue = input;
    value = input;
  }

  public void add (int add){
      value += add;
  }

  public void add(){
    value += 1;
  }

  public int get () {
    return this.value;
  }

  public void reset(){
    value = initialValue;
  }
}
