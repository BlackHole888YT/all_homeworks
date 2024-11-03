package month2.homework1_1;

public class Vehicle {
    private String brand;
    private Engine engine;
    private FuelType fuelType;

    public Vehicle(String brand, Engine engine, FuelType fuelType) {
        this.brand = brand;
        this.engine = engine;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void startEngine() {
        System.out.println(brand + " двигатель запущен");
    }
}
