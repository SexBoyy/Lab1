package by.epamtc.task.task3;

import by.epamtc.util.exception.SquareException;
import by.epamtc.util.tool.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите площадь квадрата");
        double squareArea = DataScanner.enterDoubleFromConsole();
        try {
            double squareArea2 = SquareArea.calcSquareArea(squareArea);
            System.out.println("Площадь квадрата, вписанного в окружность," +
                    " вписанной в квадрат, заданного площадью, равной "+ squareArea+", равна = "+ squareArea2);
        }catch (SquareException squareException){
            System.err.println(squareException.getMessage());
        }
    }
}
