package task8;

public class Funtion {
    public static double calcFunction(double x) {
        if (x >= 3) {
            return (-1) * x * x + 3 * x + 9;
        } else {
            return 1 / (x * x * x - 6);
        }
    }
}
