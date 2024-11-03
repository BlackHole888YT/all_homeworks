package month2.homework1_1;

public final class SportsCar extends Car {
    private int topSpeed;

    public SportsCar(String brand, Engine engine, FuelType fuelType, int doors, int topSpeed) {
        super(brand, engine, fuelType, doors);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " спортивный двигатель запущен на полной мощности!");
    }
}
