package task5;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) throws IllegalArgumentException {
        if (number<1) throw new IllegalArgumentException("Задайте число больше 1");
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }
}
