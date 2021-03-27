package by.epamtc.task.task9;
import by.epamtc.util.tool.DataScanner;


public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите радиус");
        double radius = DataScanner.enterDoubleFromConsole();
        double square = Circle.calcSquareCircle(radius);
        double length = Circle.calcCircumference(radius);
        System.out.println("Площадь круга равна " + square);
        System.out.println("Длина окружности равна " + length);
    }
}
