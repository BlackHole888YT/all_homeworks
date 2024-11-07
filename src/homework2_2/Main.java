package month2.homework2_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> List_A = new ArrayList<>();

        int a = 0;
        System.out.println("Введите имена");
        while (a != 5){
            String input = scanner.nextLine();
            List_A.add(input);
            a += 1;
        }
        System.out.println("List A: " + List_A);
        a = 0;

        ArrayList<String> List_B = new ArrayList<>();

        System.out.println("Введите имена");
        while (a != 5){
            String input = scanner.nextLine();
            List_B.add(input);
            a += 1;
        }
        System.out.println("List B: " + List_B);


        ArrayList<String> List_C = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            List_C.add(List_A.get(i));           // Добавляем элемент из списка A
            List_C.add(List_B.get(4 - i));       // Добавляем элемент из списка B, начиная с конца
        }

        System.out.println("List C до сортировки: " + List_C);

        // Сортировка списка C по длине строк
        List_C.sort(Comparator.comparingInt(String::length));

        System.out.println("List C после сортировки по длине: " + List_C);

        scanner.close();
    }
}
