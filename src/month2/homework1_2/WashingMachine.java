package month2.homework1_2;

public class WashingMachine extends Appliance implements Printable {
    private int drumSize;

    public WashingMachine(String brand, int power, int drumSize) {
        super(brand, power);
        this.drumSize = drumSize;
    }

    public int getDrumSize() {
        return drumSize;
    }

    @Override
    public void print() {
        System.out.println("WashingMachine{" + "brand=" + getBrand() + ", power=" + getPower() + ", drumSize=" + drumSize + '}');
    }
}
