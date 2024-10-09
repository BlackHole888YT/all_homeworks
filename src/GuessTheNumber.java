import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        while (true){
            System.out.println("Угадайте случайное число от 1 до 5!\nВведите ваше число: ");
            Scanner yN = new Scanner(System.in);
            int yourNumber = yN.nextInt();

            int randomNumber = randomNum();

            if (yourNumber == randomNumber) {
                System.out.println("Вы угадали число " + randomNumber);
            } else {
                System.out.println("Не правильно! Случайное число это " + randomNumber);

            System.out.println("Хотите сыграть еще раз? (1-y, 0-n)");
            Scanner wantToExit = new Scanner(System.in);
            int exit = wantToExit.nextInt();
            if (exit == 0) break;
            }
        }
    }

    public static int randomNum() {
        Random rN = new Random();
        return rN.nextInt(5) + 1;
    }
}
