
import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {
        int i, num;
        boolean outputNum;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите максимальное число");
        if (in.hasNextInt()) { //Проверка, являются ли введенные значения числом
            int maxNum = in.nextInt();

            System.out.println("Простые числа: "); //Вывод простых чисел
            for (num = 2; num <= maxNum; num++) {
                i = num;
                outputNum = isPrime(num);
                if (outputNum)
                    System.out.print(i + " ");
            }
        }
        else System.out.println("Извините, но это явно не число");
    }

    public static boolean isPrime(int n) { //Проверка, являются ли введенные значения простыми числами
        for (int i = 2; i  < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
