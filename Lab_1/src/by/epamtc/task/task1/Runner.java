package by.epamtc.task.task1;
import by.epamtc.util.tool.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите число");
        int number = DataScanner.enterIntFromConsole();
        System.out.println("Последняя цифра квадрата числа = " + Number.calcLastSquareNumber(number));
    }
}
