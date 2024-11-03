package month2.homework1_2;

public class Main {
    public static void main(String[] args) {
        Printable objectA = createObject("WashingMachine");
        Printable objectB = createObject("Refrigerator");
        Printable objectC = createObject("Microwave");

        Printable[] appliances = {objectA, objectB, objectC};
        for (Printable appliance : appliances) {
            appliance.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "WashingMachine":
                return new WashingMachine("LG", 1500, 8);
            case "Refrigerator":
                return new Refrigerator("Samsung", 200, 300);
            case "Microwave":
                return new Microwave("Panasonic", 800, true);
            default:
                return null;
        }
    }
}
