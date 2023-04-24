
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Введите целое число больше 0, но меньше 100: ");
        first = num.nextInt();
        if (first < 0) {
            System.out.println("Вы ввели число меньше 0");
        } else if (first > 100) {
            System.out.println("Вы ввели число больше 100");
        } else {
            System.out.print("Введите следующее целое число: ");
            second = num.nextInt();
            result = first + second;
            System.out.println("сумма = " + result);

            switch (result) {
                case 10:
                    System.out.println("Поздравляю, сумма чисел равна десяти");
                    break;
                case 100:
                    System.out.println("Поздравляю, сумма чисел равная стам");
                    break;
                case 1000:
                    System.out.println("Поздравляю, сумма чисел равна тысячи");
                    break;
                default:
                    System.out.println("К сожелению сумма чисел не равна: 10, 100, 1000");
            }
        }
    }
}