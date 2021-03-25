package task4;

import tools.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите 4 числа");
        DataScanner dataScanner = new DataScanner();
        int numberA = dataScanner.enterIntFromConsole();
        int numberB = dataScanner.enterIntFromConsole();
        int numberC = dataScanner.enterIntFromConsole();
        int numberD = dataScanner.enterIntFromConsole();
        if (EvenNumbers.isTwoNumbersEven(numberA,numberB,numberC,numberD)) System.out.println("true");
        else System.out.println("false");
        dataScanner.close();
    }
}
