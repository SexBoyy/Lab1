package by.epamtc.task.task6;

import by.epamtc.util.exception.WrongTimeException;
import by.epamtc.util.tool.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число секунд");
        int allSeconds = DataScanner.enterIntFromConsole();
        try {
            int seconds = Time.calcSeconds(allSeconds);
            int minutes = Time.calcMinutes(allSeconds);
            int hours = Time.calcHours(allSeconds);
            System.out.println("Время - " + hours + ":" + minutes + ":" + seconds);
        }catch (WrongTimeException wrongTimeException){
            System.err.println(wrongTimeException.getMessage());
        }
    }
}
