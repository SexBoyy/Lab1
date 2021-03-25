package task9;

import tools.DataScanner;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите радиус");
        DataScanner dataScanner = new DataScanner();
        double radius = dataScanner.enterDoubleFromConsole();
        double square = Circle.calcSquareCircle(radius);
        double length = Circle.calcCircumference(radius);
        System.out.println("Площадь круга равна " + square);
        System.out.println("Длина окружности равна " + length);
        dataScanner.close();
    }
}
