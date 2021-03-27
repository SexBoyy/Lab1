package by.epamtc.task.task8;

public class Function {
    public static double calcFunction(double x) {
        if (x >= 3) {
            return (-1) * x * x + 3 * x + 9;
        } else {
            return 1 / (x * x * x - 6);
        }
    }
}
