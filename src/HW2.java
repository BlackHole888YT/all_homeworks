import java.util.Random;

public class HW2 {
    public static void permission (int age, int temperature) { // 1 и 2 пункт
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
    }

    public static int generateRandomAge() { // пункт
        Random genRandomAgeNumber = new Random();
        return genRandomAgeNumber.nextInt(100);  // Возраст от 0 до 99
    }

    public static void main(String[] args) { // 3 пункт (вызвать 5 раз)
        permission(10, -30);
        permission(15, 10);
        permission(20, 18);
        permission(35, 35);
        permission(45, 10);

        permission(generateRandomAge(), 10); // 5 пункт
    }
}
