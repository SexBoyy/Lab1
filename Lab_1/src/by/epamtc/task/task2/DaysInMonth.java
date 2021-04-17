package by.epamtc.task.task2;

import by.epamtc.util.exception.WrongDateException;

public class DaysInMonth {
    public static int getDaysInMonth(int monthInt, int year) throws WrongDateException {
        if(year<0) throw new WrongDateException("Неправильный год");
        int days = 0;
        Month month = Month.values()[monthInt-1];
        switch (month){
            case JANUARY: case MARCH: case MAY: case JULY: case AUGUST:
                case OCTOBER: case DECEMBER:
                days = 31;
                break;
            case APRIL: case JUNE: case SEPTEMBER: case NOVEMBER:
                days = 30;
                break;
            case FEBRUARY:
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
