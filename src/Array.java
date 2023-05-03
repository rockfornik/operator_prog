import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int n;
        int [] a;
        int sum = 0;
        Scanner i = new Scanner(System.in);
        System.out.print("Введите положительное количество эллементов массива: ");
        n = i.nextInt();
        a = new int[n];
        for (int z = 0; z < n; z++){
        System.out.print("Введите a[" + z + "] = ");
        a[z] = i.nextInt();
        sum = sum + a[z];
        }
        System.out.print("Сумма элементов массива = " + sum);
    }
}
