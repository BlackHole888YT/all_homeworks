package month2.homework1_1;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, Engine engine, FuelType fuelType, int doors) {
        super(brand, engine, fuelType);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void openTrunk() {
        System.out.println("Багажник открыт.");
    }

    public void openTrunk(int items) {
        System.out.println("Багажник открыт, внутри " + items + " предметов.");
    }

    public final void openTrunk(String message) {
        System.out.println("Багажник открыт. Сообщение: " + message);
    }
}
