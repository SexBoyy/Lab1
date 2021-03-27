package by.epamtc.task.task3;

import by.epamtc.util.exception.SquareException;

public class SquareArea {
    public static double calcSquareArea(double area) throws SquareException {
        if (area<0) throw new SquareException("Площадь не может быть отрицательной");
        return area/2;
    }
}
