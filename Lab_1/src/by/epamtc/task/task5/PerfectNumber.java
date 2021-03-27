package by.epamtc.task.task5;

import by.epamtc.util.exception.NaturalNumberException;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) throws NaturalNumberException {
        if (number<1) throw new NaturalNumberException("Задайте число больше 1");
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }
}
