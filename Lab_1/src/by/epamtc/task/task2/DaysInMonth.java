package by.epamtc.task.task2;

import by.epamtc.util.exception.WrongDateException;

public class DaysInMonth {
    public static int getDaysInMonth(int month, int year) throws WrongDateException {
        if(year<0) throw new WrongDateException("Неправильный год");
        if(month<1||month>12) throw new WrongDateException("Неправильный месяц");
        int days = 0;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year)) days = 29;
                else days = 28;
            break;
        }
        return days;
    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return true;
        return false;
    }
}
