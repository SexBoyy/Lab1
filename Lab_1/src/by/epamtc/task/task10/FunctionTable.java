package by.epamtc.task.task10;

import javafx.util.Pair;

public class FunctionTable {
    public static Pair<Double, Double>[] tanTable(double a, double b, double h) throws IllegalArgumentException {
        if (b < a) throw new IllegalArgumentException("Некорректные границы");
        if (h <= 0) throw new IllegalArgumentException("Некорректный шаг");
        int size = calcTableSize(a, b, h) + 1;
        Pair<Double, Double>[] table = new Pair[size];
        double x = a;
        for (int i = 0; i < size; i++) {
            table[i] = new Pair<>(x, Math.tan(x));
            x += h;
        }
        return table;
    }
    private static int calcTableSize(double a, double b , double h){
        return (int)((b-a)/h);
    }
}
