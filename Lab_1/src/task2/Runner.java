package task2;

import tools.DataScanner;

public class Runner {
    public static void main(String[] args){
        System.out.println("Введите год");
        DataScanner dataScanner = new DataScanner();
        int year = dataScanner.enterIntFromConsole();
        System.out.println("Введите месяц");
        int month = dataScanner.enterIntFromConsole();
        try {
            int days = DaysInMonth.getDaysInMonth(month, year);
            System.out.println("Количество дней в месяце = "+ days);
        }catch (IllegalArgumentException illegalArgumentException){
            System.err.println(illegalArgumentException.getMessage());
        }
        dataScanner.close();
    }
}
