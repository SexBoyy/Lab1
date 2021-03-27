package by.epamtc.task.task6;

import by.epamtc.util.exception.WrongTimeException;

public class Time {
    public static int calcSeconds(int seconds) throws WrongTimeException {
        return (seconds - 3600*calcHours(seconds)-60*calcMinutes(seconds));
    }
    public static int calcMinutes(int seconds) throws WrongTimeException{
        return (seconds - 3600*calcHours(seconds))/60;
    }
    public static int calcHours(int seconds) throws WrongTimeException {
        if(seconds>=MAX_SECONDS) throw new WrongTimeException("Секунд больше чем сутках");
        if(seconds<0) throw new WrongTimeException("Отрицательное число секунд");
        return seconds / 3600;
    }
    public static int MAX_SECONDS = 24*3600;
}
