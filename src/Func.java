import java.util.Scanner;
//Функция func
public class Func {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int a, b;
        System.out.print("Введите число: ");
        a = one.nextInt();
        System.out.print("Введите положительную степень: ");
        b = one.nextInt();
        if (b < 0) {
            System.out.println("Вы ввели отрицательное значение");
        } else {
        int temp = func (a, b);
        System.out.print(temp);
        }
    }

    public static int func (int a, int b) {
        int r = 1;
        //возведение в степень
        for (int i = 0; i < b; i++)
            r *= a;
        return  r;
    }
}
