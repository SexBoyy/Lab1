package task8;

import tools.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите x");
        DataScanner dataScanner = new DataScanner();
        double x = dataScanner.enterDoubleFromConsole();
        double funcX = Funtion.calcFunction(x);
        System.out.println("Результат работы функции f(x) = " + funcX);
        dataScanner.close();
    }
}
