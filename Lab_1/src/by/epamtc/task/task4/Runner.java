package by.epamtc.task.task4;

import by.epamtc.util.tool.DataScanner;
public class Runner {
    public static void main(String[] args){
        System.out.println("Введите 4 числа");
        int numberA = DataScanner.enterIntFromConsole();
        int numberB = DataScanner.enterIntFromConsole();
        int numberC = DataScanner.enterIntFromConsole();
        int numberD = DataScanner.enterIntFromConsole();
        if (EvenNumbers.isTwoNumbersEven(numberA,numberB,numberC,numberD)) System.out.println("true");
        else System.out.println("false");
    }
}
