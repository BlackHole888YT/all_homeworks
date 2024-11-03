package month2.homework1_2;

public class Microwave extends Appliance implements Printable {
    private boolean hasGrill;

    public Microwave(String brand, int power, boolean hasGrill) {
        super(brand, power);
        this.hasGrill = hasGrill;
    }

    public boolean isHasGrill() {
        return hasGrill;
    }

    @Override
    public void print() {
        System.out.println("Microwave{" + "brand=" + getBrand() + ", power=" + getPower() + ", hasGrill=" + hasGrill + '}');
    }
}
