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
        long temp = func (a, b);
        if (temp != 0)
            System.out.print(temp);
        else
            System.out.println("Слишком большое число");
        }
    }

    public static long func (int a, int b) {
        long r = 1;
        //возведение в степень
        for (int i = 0; i < b; i++)
            r *= a;
        return  r;
    }
}
