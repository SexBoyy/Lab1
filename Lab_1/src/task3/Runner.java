package task3;

import tools.DataScanner;

public class Runner {
    public static void main(String[] args){
        DataScanner scanner = new DataScanner();
        System.out.println("Введите площадь квадрата");
        double squareArea = scanner.enterDoubleFromConsole();
        try {
            double squareArea2 = SquareArea.calcSquareArea(squareArea);
            System.out.println("Площадь квадрата, вписанного в окружность," +
                    " вписанной в квадрат, заданного площадью, равной "+ squareArea+", равна = "+ squareArea2);
        }catch (IllegalArgumentException exception){
            System.err.println(exception.getMessage());
        }
        scanner.close();
    }
}
