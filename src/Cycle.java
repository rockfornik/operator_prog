import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner num2 = new Scanner(System.in);
        int first2;
        System.out.print("Введите 100 или 10: ");
        first2 = num2.nextInt();
        if (first2 == 100) {
            for (first2 = 100; first2 >= 10; first2 -= 10)
                System.out.println("Вывод чисел от 100 до 10: " + first2);
        } else if (first2 == 10) {
            while (first2 <= 100) {
                System.out.println("Вывод чисел от 10 до 100: " + first2);
                first2 += 10;
            }
        } else {
            do {
                System.out.println("Вы ввели число отличное от 100 или 10: " + first2);
            } while (first2 == 10 && first2 == 100);
        }
    }
}
