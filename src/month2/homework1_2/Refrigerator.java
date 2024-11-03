package month2.homework1_2;

public class Refrigerator extends Appliance implements Printable {
    private int capacity;

    public Refrigerator(String brand, int power, int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void print() {
        System.out.println("Refrigerator{" + "brand=" + getBrand() + ", power=" + getPower() + ", capacity=" + capacity + '}');
    }
}
