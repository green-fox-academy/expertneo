public class Station {
  int gasAmountTotalServed;

  public void refill(Car car) {
    gasAmountTotalServed = car.gasCapacity - car.gasAmount;
    car.setGasAmount();
  }

  public int getGasAmountTotalServed(){
    return this.gasAmountTotalServed;
  }
}
