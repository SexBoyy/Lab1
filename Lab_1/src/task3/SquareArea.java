package task3;

public class SquareArea {
    public static double calcSquareArea(double area) throws IllegalArgumentException{
        if (area<0) throw new IllegalArgumentException("Площадь не может быть отрицательной");
        return area/2;
    }
}
