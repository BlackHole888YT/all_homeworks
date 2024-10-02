import java.util.Random;

public class HW2 {
    public static String permission (int age, int temperature) { // 1 и 2 пункт
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() { // 4 пункт
        Random genRandomAgeNumber = new Random();
        return genRandomAgeNumber.nextInt(100);  // Возраст от 0 до 99
    }

    public static void main(String[] args) { // 3 пункт (вызвать 5 раз)
        System.out.println(permission(10, -30));
        System.out.println(permission(15, 10));
        System.out.println(permission(20, 18));
        System.out.println(permission(35, 35));
        System.out.println(permission(45, 10));

        System.out.println(permission(generateRandomAge(), 10)); // 5 пункт
    }
}
