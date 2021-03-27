package by.epamtc.task.task8;

import by.epamtc.util.tool.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите x");
        double x = DataScanner.enterDoubleFromConsole();
        double funcX = Function.calcFunction(x);
        System.out.println("Результат работы функции f(x) = " + funcX);
    }
}
