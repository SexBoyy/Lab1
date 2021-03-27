package by.epamtc.task.task5;

import by.epamtc.util.exception.NaturalNumberException;
import by.epamtc.util.tool.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите число");
        int number = DataScanner.enterIntFromConsole();
        try {
            if (PerfectNumber.isPerfectNumber(number)) System.out.println("true");
            else System.out.println("false");
        }catch (NaturalNumberException naturalNumberException){
            System.err.println(naturalNumberException.getMessage());
        }
    }
}
