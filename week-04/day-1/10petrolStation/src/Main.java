public class Main {
  public static void main(String[] args) {

    int initialFuelInTheCar = 40;

    Car lada = new Car(initialFuelInTheCar);

    Station mol = new Station();
    mol.refill(lada);

    System.out.println("Initial fuel in the car; " + initialFuelInTheCar);
    System.out.println("Gas served by the station: " + mol.gasAmountTotalServed);
    System.out.println("Gas amount in the car: " + lada.getGasAmount());
    System.out.println("Gas capacity of the car: " + lada.getGasCapacity());
  }
}
