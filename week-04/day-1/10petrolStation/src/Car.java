import javax.xml.catalog.Catalog;

public class Car {
  int gasAmount;
  int gasCapacity;

  public Car(){
    gasAmount = 0;
    gasCapacity = 100;
  }

  public Car(int input){
    this.gasAmount = input;
    this.gasCapacity = 100;
  }

  public void setGasAmount(){
    this.gasAmount = gasCapacity;
  }

  public int getGasAmount(){
    return this.gasAmount;
  }

  public int getGasCapacity(){
    return  this.gasCapacity;
  }
}
