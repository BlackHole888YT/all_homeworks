package month2.homework1_1;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(200);
        Engine sportsCarEngine = new Engine(400);

        Car objectA = new Car("Toyota", carEngine, FuelType.GASOLINE, 4);
        SportsCar objectB = new SportsCar("Ferrari", sportsCarEngine, FuelType.GASOLINE, 2, 350);
        SportsCar objectC = new SportsCar("Lamborghini", sportsCarEngine, FuelType.GASOLINE, 2, 370);

        System.out.println("ObjectA: " + objectA.getBrand() + ", " + objectA.getEngine() + ", " + objectA.getFuelType() + ", Doors: " + objectA.getDoors());
        System.out.println("ObjectB: " + objectB.getBrand() + ", " + objectB.getEngine() + ", " + objectB.getFuelType() + ", Doors: " + objectB.getDoors() + ", Top Speed: " + objectB.getTopSpeed());
        System.out.println("ObjectC: " + objectC.getBrand() + ", " + objectC.getEngine() + ", " + objectC.getFuelType() + ", Doors: " + objectC.getDoors() + ", Top Speed: " + objectC.getTopSpeed());

        objectA.openTrunk();
        objectA.openTrunk(5);
        objectA.openTrunk("Все в порядке");

        objectB.startEngine();
        objectC.startEngine();
    }
}
