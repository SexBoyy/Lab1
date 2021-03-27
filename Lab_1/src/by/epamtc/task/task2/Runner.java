package by.epamtc.task.task2;

import by.epamtc.util.exception.WrongDateException;
import by.epamtc.util.tool.DataScanner;


public class Runner {
    public static void main(String[] args){
        System.out.println("Введите год");
        int year = DataScanner.enterIntFromConsole();
        System.out.println("Введите месяц");
        int month = DataScanner.enterIntFromConsole();
        try {
            int days = DaysInMonth.getDaysInMonth(month, year);
            System.out.println("Количество дней в месяце = "+ days);
        }catch (WrongDateException wrongDateException){
            System.err.println(wrongDateException.getMessage());
        }
    }
}
